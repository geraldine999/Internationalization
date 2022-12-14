package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;

@Configuration
public class Config {

    @Bean
    public LocaleResolver localeResolver() {
        return new CustomLocaleResolver();
    }
}
