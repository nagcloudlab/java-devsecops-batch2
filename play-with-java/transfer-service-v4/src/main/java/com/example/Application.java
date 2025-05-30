package com.example;

import com.example.service.TransferService;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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

        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        System.out.println();
        System.out.println();
        //----------------------------------------
        // run
        //----------------------------------------

        // TransferService transferService = applicationContext.getBean("transferService", TransferService.class);
        // transferService.transfer(
        //         "1234567890",
        //         "0987654321",
        //         100.0);

        System.out.println();
        System.out.println();
        //----------------------------------------
        // shutdown
        //----------------------------------------
        // clean up resources, if any
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            if (applicationContext != null) {
                applicationContext.close();
            }
            System.out.println("Application is shutting down...");
        }));

    }
    

    @Bean
    public CommandLineRunner commandLineRunner(TransferService transferService) {
        return args -> {
            // This method can be used to run any code after the application has started
            logger.info("Application started successfully.");
            List<String> accountNumbers = Arrays.asList(
            "1234567890",
            "0987654321",  
            "1122334455"
        );

        Random random = new Random();

        while (true) {
            try {
                // Pick 2 different accounts
                int fromIndex = random.nextInt(accountNumbers.size());
                int toIndex;
                do {
                    toIndex = random.nextInt(accountNumbers.size());
                } while (toIndex == fromIndex);

                String fromAccount = accountNumbers.get(fromIndex);
                String toAccount = accountNumbers.get(toIndex);
                double amount = 1 + random.nextInt(10); 

                transferService.transfer(fromAccount, toAccount, amount);

                System.out.printf("Transferred %.2f from %s to %s%n", amount, fromAccount, toAccount);
                Thread.sleep(1000); // 1-second interval

            } catch (Exception e) {
                e.printStackTrace();
                Thread.sleep(2000); // wait before retrying
            }
        }
        };
    }

}
