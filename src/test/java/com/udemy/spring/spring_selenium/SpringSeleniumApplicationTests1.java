package com.udemy.spring.spring_selenium;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringSeleniumApplicationTests1 {
	@Autowired
	private Faker faker;
	@Test
	void contextLoads() {

		System.out.println(faker.name().firstName());




	}

}
