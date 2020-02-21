package com.example.eurekaserver9100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer9100Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer9100Application.class, args);
    }

}
