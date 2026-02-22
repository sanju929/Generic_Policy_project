package com.example.zen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		exclude = {
				org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class
		}
)
public class ZenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZenApplication.class, args);
	}

}
