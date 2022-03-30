package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}

}

@Component
class JpaApplicationWriter implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("hello");
	}
}
