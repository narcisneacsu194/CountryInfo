package com.teamtreehouse.countryinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class CountryApp {
    public static void main(String[] args){
        SpringApplication.run(CountryApp.class, args);
    }
}
