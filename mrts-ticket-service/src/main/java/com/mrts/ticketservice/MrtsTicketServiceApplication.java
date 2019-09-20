package com.mrts.ticketservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.mrts.ticketservice")
public class MrtsTicketServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MrtsTicketServiceApplication.class, args);
    }

}
