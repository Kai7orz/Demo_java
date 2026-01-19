package com.example.demo.repository;

import com.example.demo.model.TrainingData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
@Profile("staging")
public class MockTrainingRepository implements TrainingDataRepository{
    private TrainingData td;
    public MockTrainingRepository() {
        Map<Integer,String> mockData = new HashMap<Integer,String>();
        mockData.put(0,"mockData0");
        mockData.put(1,"mockData1");
        this.td = new TrainingData(mockData);
    }

    public TrainingData findAll() {
        Map<Integer,String> argData = this.td.getData();
        return new TrainingData(argData);
    }
}
