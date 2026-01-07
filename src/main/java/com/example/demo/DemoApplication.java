package com.example.demo;

import com.example.demo.infrastructure.TrainingRepository;
import com.example.demo.model.Training;
import com.example.demo.usecase.user.TrainingService;
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

		TrainingRepository trainingRepository = new TrainingRepository("testTrain2");
		TrainingService trainingService = new TrainingService(trainingRepository);

		List<Training> trainings = trainingService.findAll();
		System.out.println("trainings: "+trainings.get(0).getTrainingName());
	}
}
