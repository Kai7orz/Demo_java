package com.example.demo.repository;

import com.example.demo.model.TrainingData;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TrainingRepository implements TrainingDataRepository {
    private static final String DATABASE_NAME = "train";
    private static final String DATABASE = "127.0.0.1:3307";
    private static final String URL = "jdbc:mySQL://" + DATABASE + "/" + DATABASE_NAME;
    private static final String USER = "root";
    private static final String PASSWORD = "root_password";
    private DataSource dataSource;
    private Connection conn;
    private JdbcTemplate jdbcTemplate;

    public TrainingRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public TrainingData findAll() {
        List<String> names = this.jdbcTemplate.queryForList("SELECT name FROM training",String.class);
        // SQL 作成
        // 取得データを Map につめて，TrainingData インスタンスを返す
        Map<Integer,String> mockData = new HashMap<Integer,String>();
        mockData.put(0,names.get(0));
        mockData.put(1,"DataAsDB1");
        return new TrainingData(mockData);
    }
}