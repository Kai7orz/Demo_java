package com.example.demo;

import com.example.demo.model.TrainingData;
import com.example.demo.repository.MockTrainingRepository;
import com.example.demo.repository.TrainingDataRepository;
import com.example.demo.repository.TrainingRepository;
import com.example.demo.service.TrainingService;
import com.example.demo.usecase.user.Monster;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan
public class DemoApplication {
	public static void main(String[] args) {

		Monster monster1 = new Monster("testName1");
		Monster monster2 = new Monster("testName1");
		Monster monster3 = new Monster("testName3");
		Monster monster4 = new Monster("testName4");

		List<Monster> monsterList1 = new ArrayList<>();
		List<Monster> monsterList2 = new ArrayList<>();

		System.out.println("Monster equal:"+ monster1.hashCode());
		System.out.println("Monster equal:"+ monster2.hashCode());
//		System.out.println("class information: "+DemoApplication.class);
//		ApplicationContext context = new AnnotationConfigApplicationContext(DemoApplication.class);
//		// DI コンテナから任意の Bean を取得する
//		TrainingService trainingService = context.getBean(TrainingService.class);
//		trainingService.displayTrainingData();
	}
}
