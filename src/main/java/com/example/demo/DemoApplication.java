package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);}

	@GetMapping("/hello")
	public int getDemo() {
		enum Answer {
			YES,
			NEUTRAL,
			NO
		}
		Answer a;
		a = Answer.NEUTRAL;
		System.out.println("Answer is "+a);
		var array = new int[100];
		int testNumber = 100;
		return testNumber;
	}
}

public class SixMessages5 {
	static void message(int n) {
		for(int i=0; i < n; i++) {
			System.out.println("Helllo .");
		}
	}
}
