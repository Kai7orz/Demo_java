package com.example.demo.repository;

import com.example.demo.model.TrainingData;

import java.util.Map;

public interface TrainingDataRepository {
    TrainingData findById(Integer id);
    TrainingData findAll();
}
