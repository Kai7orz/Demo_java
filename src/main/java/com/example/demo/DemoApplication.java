package com.example.demo;

import com.example.demo.model.TrainingData;
import com.example.demo.repository.MockTrainingRepository;
import com.example.demo.repository.TrainingDataRepository;
import com.example.demo.repository.TrainingRepository;
import com.example.demo.service.TrainingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		// repo の準備
		//TrainingDataRepository repo = new MockTrainingRepository();
		TrainingDataRepository repo = new TrainingRepository();

		// service の呼び出し
		TrainingService svc = new TrainingService(repo);
		svc.displayTrainingData();
		svc.displayTrainingDataById(0);
	}
}
