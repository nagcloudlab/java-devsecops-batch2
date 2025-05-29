package com.example;

import com.example.service.TransferService;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.example")
public class Application {


    private static Logger logger = org.slf4j.LoggerFactory.getLogger("transfer-service");

    public static void main(String[] args) {

        //----------------------------------------
        // init / boot
        //----------------------------------------
        // initialize & assemble application's
        // components based on config

        //AccountRepository accountRepository = AccountRepositoryFactory.getAccountRepository("jpa");
        //TransferService transferService = new UPITransferService(accountRepository);

        ConfigurableApplicationContext applicationContext = null;
        applicationContext= SpringApplication.run(Application.class, args);

        System.out.println();
        System.out.println();
        //----------------------------------------
        // run
        //----------------------------------------

//        TransferService transferService = applicationContext.getBean("transferService", TransferService.class);
//        transferService.transfer(
//                "1234567890",
//                "0987654321",
//                100.0
//        );


        String bean1 = applicationContext.getBean("bean1", String.class);
        System.out.println("Bean1: " + bean1);

        System.out.println();
        System.out.println();
        //----------------------------------------
        // shutdown
        //----------------------------------------
        // clean up resources, if any


    }
}
