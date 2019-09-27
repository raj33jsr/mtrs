package com.mrts.saleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.mrts.saleservice")
public class MrtsSaleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MrtsSaleServiceApplication.class, args);
	}

}
