package com.example.demo;

import com.example.demo.model.TrainingData;
import com.example.demo.repository.MockTrainingRepository;
import com.example.demo.repository.TrainingDataRepository;
import com.example.demo.repository.TrainingRepository;
import com.example.demo.service.TrainingService;
import com.example.demo.usecase.user.Main;
import com.example.demo.usecase.user.Monster;
import com.example.demo.usecase.user.Pocket;
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
import java.util.function.Function;

@Configuration
@ComponentScan
public class DemoApplication {
	public static void main(String[] args) {
		// DataSaurce という Repository と JDBC の間をつなぐクラスを用意.
		// DataSauce を JDBC を操作するためのクラスにインジェクションする.
		Function<String,Integer> function = Main::len;
		System.out.println(function.apply("hello"));
	}
}
