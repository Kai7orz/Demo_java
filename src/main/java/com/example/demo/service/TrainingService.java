package com.example.demo.service;

import com.example.demo.repository.TrainingDataRepository;

public class TrainingService {
    private TrainingDataRepository repo;

    public TrainingService(TrainingDataRepository repo){
        this.repo = repo;
    }

    public void displayTrainingData(){
        System.out.println(this.repo.findAll().getData());
    }

    public void displayTrainingDataById(Integer id) {
        System.out.println(this.repo.findById(id).getData());
    }
}
