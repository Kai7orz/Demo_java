package com.example.demo.model;

import com.example.demo.usecase.user.TrainingService;

public class Training {
    private String trainingName = "test";

    public Training(String trainingName) {
        this.trainingName = trainingName;
    }
    public String getTrainingName(){
        return this.trainingName;
    }
}
