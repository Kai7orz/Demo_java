package com.example.demo.usecase.user;

import com.example.demo.infrastructure.TrainingRepository;
import com.example.demo.model.Training;

import java.util.List;

public class TrainingService {
    private TrainingRepository trainingRepository;

    public TrainingService(TrainingRepository trainingRepository){
        this.trainingRepository = trainingRepository;
    }

    public List<Training> findAll() {
        return trainingRepository.selectAll();
    }
}
