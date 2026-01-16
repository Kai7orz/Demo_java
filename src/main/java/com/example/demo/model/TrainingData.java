package com.example.demo.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainingData {
    private Map<Integer,String> trainingData = new HashMap<Integer,String>();

    public TrainingData (Map<Integer,String> receivedData) {
        this.trainingData = receivedData;
    }

    public Map<Integer,String> getData() {
        return this.trainingData;
    }

    public Map<Integer,String> getDataById(Integer id) {
        if(this.trainingData.get(id)!= null){
            Map<Integer, String> responseData = new HashMap<Integer, String>();
            responseData.put(id,this.trainingData.get(id));
            return responseData;
        }
        else{
            return null;
        }
    }
}
