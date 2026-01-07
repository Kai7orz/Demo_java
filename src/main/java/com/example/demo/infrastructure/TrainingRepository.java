package com.example.demo.infrastructure;

import com.example.demo.model.Training;

import java.util.ArrayList;
import java.util.List;

public class TrainingRepository {
    private String trainNameToBeSet = "testTrain";

    public TrainingRepository(String trainNameToBeSet) {
        this.trainNameToBeSet = trainNameToBeSet;
    }

    public List<Training> selectAll() {
        Training testTrain = new Training(this.trainNameToBeSet);
        List<Training> trainList = new ArrayList<Training>();
        trainList.add(testTrain);
        return trainList;
    }
}
