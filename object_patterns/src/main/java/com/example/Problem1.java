package com.example;

//-----------------------------------------
// configuration
//-----------------------------------------

import java.util.concurrent.TimeUnit;

class Configuration {

    //private static Configuration config = new Configuration(); // Eager Initialization
    private static Configuration config = null; // Lazy Initialization

    // URL
    // credentials
    // certificates
    private Configuration() {
        // Load configuration from a file or environment variables
        // For example, read from a properties file
        // this.url = ...
        // this.credentials = ...
        // this.certificates = ...
        System.out.println("Configuration loaded & instance created");

    }

    public static synchronized Configuration getConfiguration() {
        if (config == null) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // Lazy initialization
            config = new Configuration();
        }
        return config;
    }

}


public class Problem1 {

    public static void main(String[] args) {

        //------------------------------------
        // team-1 : module1
        //------------------------------------

        //Configuration config1 = new Configuration();
        //Configuration config1 = Configuration.getConfiguration();
        Thread t1 = new Thread(() -> {
            Configuration config1 = Configuration.getConfiguration();
        });
        t1.start();


        //------------------------------------
        // team-2 : module2
        //------------------------------------

        //Configuration config2 = new Configuration();
        //Configuration config2 = Configuration.getConfiguration();

        //------------------------------------

        Thread t2 = new Thread(() -> {
            Configuration config2 = Configuration.getConfiguration();
        });
        t2.start();

    }

}
