package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfigue {

    @Bean
    @Scope("prototype")
    public Movie movie() {
        return new Movie();
    }
    @Bean
    public Actor actor() {
        return new Actor("Alpha","neutral",31);
    }

}
