package com.Transaction2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Transaction2Application {

	public static void main(String[] args) {
		SpringApplication.run(Transaction2Application.class, args);
	}

}
