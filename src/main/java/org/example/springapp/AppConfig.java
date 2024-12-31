package org.example.springapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.springapp")
public class AppConfig {
    @Bean(initMethod = "dbStart", destroyMethod = "dbClose")
    public DatabaseBean databaseBean(){
        return new DatabaseBean();
    }
}
