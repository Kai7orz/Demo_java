package com.example.demo.service;

import com.example.demo.repository.TrainingDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainingService {
    private TrainingDataRepository repo;

    @Autowired
    public TrainingService(TrainingDataRepository repo){
        this.repo = repo;
    }

    public void displayTrainingData(){
        System.out.println(this.repo.findAll().getData());
    }
}
