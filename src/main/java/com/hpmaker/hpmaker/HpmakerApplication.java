package com.hpmaker.hpmaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HpmakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HpmakerApplication.class, args);
	}

}
