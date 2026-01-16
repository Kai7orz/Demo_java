package com.example.demo.repository;

import com.example.demo.model.TrainingData;

import java.util.HashMap;
import java.util.Map;

public class MockTrainingRepository implements TrainingDataRepository{
    private TrainingData td;
    public MockTrainingRepository() {
        Map<Integer,String> mockData = new HashMap<Integer,String>();
        mockData.put(0,"mockData0");
        mockData.put(1,"mockData1");
        this.td = new TrainingData(mockData);
    }

    public TrainingData findById(Integer id){ // TrainingData td から該当id データを返す
        Map<Integer,String> argData = this.td.getDataById(id); // 検索

        if(argData != null){
            return new TrainingData(argData); // Map を TrainingData 型に変換
        }
        else {
            return null;
        }
    }
    public TrainingData findAll() {
        Map<Integer,String> argData = this.td.getData();
        return new TrainingData(argData);
    }
}
