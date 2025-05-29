package com.example;

import com.example.config.DataSourceConfiguration;
import com.example.config.JdbcTemplateConfiguration;
import com.example.repository.AccountRepository;
import com.example.repository.AccountRepositoryFactory;
import com.example.repository.JdbcAccountRepository;
import com.example.repository.JpaAccountRepository;
import com.example.service.TransferService;
import com.example.service.UPITransferService;
import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@Import({
        DataSourceConfiguration.class,
        JdbcTemplateConfiguration.class
})
@ComponentScan(basePackages = "com.example")
public class Application {


    private static Logger logger = Logger.getLogger("transfer-service");

    public static void main(String[] args) {

        //----------------------------------------
        // init / boot
        //----------------------------------------
        // initialize & assemble application's
        // components based on config

        //AccountRepository accountRepository = AccountRepositoryFactory.getAccountRepository("jpa");
        //TransferService transferService = new UPITransferService(accountRepository);

        ConfigurableApplicationContext applicationContext = null;
        //applicationContext = new ClassPathXmlApplicationContext("transfer-service.xml");
        applicationContext = new AnnotationConfigApplicationContext(Application.class);

        System.out.println();
        System.out.println();
        //----------------------------------------
        // run
        //----------------------------------------

        TransferService transferService = applicationContext.getBean("transferService", TransferService.class);
        transferService.transfer(
                "1234567890",
                "0987654321",
                100.0
        );

        System.out.println();
        System.out.println();
        //----------------------------------------
        // shutdown
        //----------------------------------------
        // clean up resources, if any


    }
}
