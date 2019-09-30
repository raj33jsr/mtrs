package com.mrts.adminservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class MrtsAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MrtsAdminServerApplication.class, args);
	}

}
