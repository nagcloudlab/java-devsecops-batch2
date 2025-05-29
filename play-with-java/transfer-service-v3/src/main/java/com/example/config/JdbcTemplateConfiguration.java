package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JdbcTemplateConfiguration {


    @Bean
    public org.springframework.jdbc.core.JdbcTemplate jdbcTemplate(javax.sql.DataSource dataSource) {
        return new org.springframework.jdbc.core.JdbcTemplate(dataSource);
    }

}
