package org.example.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(
        name = "npci.location",
        havingValue = "hyderabad"
)
public class NPCIAutoConfiguration {

    @Bean
    public String bean1(){
        return "Bean1 from NPCIAutoConfiguration";
    }

}
