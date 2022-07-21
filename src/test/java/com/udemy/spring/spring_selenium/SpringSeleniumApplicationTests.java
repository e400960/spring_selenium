package com.udemy.spring.spring_selenium;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.LineSeparatorDetector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringSeleniumApplicationTests {
	@Autowired
	private User user;
	@Value("${JAVA_HOME}")
	private String path;
	@Value("${test_url:https://www.google.com}")
	private String url;
	@Value("${fruits}")
	private List<String> fruits;
	@Test
	void contextLoads() {

		user.printDetails();
		//System.out.println(this.path);
		System.out.println(this.fruits);
		System.out.println(fruits.size());
		System.out.println(url);

	/*	Address address = new Address();
		Salary salary = new Salary();
    	User user = new User(address,salary);
    	user.printDetails();  */


	}

}
