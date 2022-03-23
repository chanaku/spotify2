package com.chana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chana.config.EntityManager;
import com.chana.controller.HomeController;
import com.chana.util.TestController;


@SpringBootApplication
@EnableAutoConfiguration
public class MainSpot {
	public static void main(String[] args) {
		SpringApplication.run(MainSpot.class, args);
		TestController test = new TestController();
		test.test();
	}
}
