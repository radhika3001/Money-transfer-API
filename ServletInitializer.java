package com.ubk.bank.money.transfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(ServletInitializer.class, args);
	}
}
