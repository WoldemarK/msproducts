package com.example.msproducts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MsproductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsproductsApplication.class, args);
    }

}
