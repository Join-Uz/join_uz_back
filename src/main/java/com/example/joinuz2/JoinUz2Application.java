package com.example.joinuz2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JoinUz2Application {

	public static void main(String[] args) {
		SpringApplication.run(JoinUz2Application.class, args);
	}

}
