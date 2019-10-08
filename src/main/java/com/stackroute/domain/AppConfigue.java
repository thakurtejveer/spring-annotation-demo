package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigue {
    @Bean
    public Movie movie() {
        return new Movie();
    }
    @Bean
    public Actor actor() {
        return new Actor("Alpha","neutral",31);
    }
}
