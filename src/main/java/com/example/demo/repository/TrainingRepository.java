package com.example.demo.repository;

import com.example.demo.model.TrainingData;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Repository
@Profile("production")
public class TrainingRepository implements TrainingDataRepository {
    private static final String DATABASE_NAME = "train";
    private static final String DATABASE = "127.0.0.1:3307";
    private static final String URL = "jdbc:mySQL://" + DATABASE + "/" + DATABASE_NAME;
    private static final String USER = "root";
    private static final String PASSWORD = "root_password";
    private Connection conn;

    public TrainingRepository() {
        connectDB();
    }

    private void connectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver found!");
        } catch (ClassNotFoundException e){
            System.out.println("Error not found jdbc");
        }

        try {
            System.out.println("Driver Manager Connection:"+URL);
            this.conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to DB successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public TrainingData findAll() {
//        JdbcTemplate jdbcTemplate = new JdbcTemplate
//        String name = jdbcTemplate.queryForObject(
//                "SELECT name FROM training WHERE id=?",Integer.class,1
//        );


        // SQL 作成
        // 取得データを Map につめて，TrainingData インスタンスを返す
        Map<Integer,String> mockData = new HashMap<Integer,String>();
        mockData.put(0,"DataAsDB0");
        mockData.put(1,"DataAsDB1");
        return new TrainingData(mockData);
    }
}