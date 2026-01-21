package com.example.demo;

import com.example.demo.service.TrainingService;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
@ComponentScan
public class DemoApplication {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(DemoApplication.class);
		TrainingService trainingService = context.getBean(TrainingService.class);
		trainingService.displayTrainingData();
	}

	@Bean
	public DataSource dataSource() {
		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mySQL://127.0.0.1:3307/train");
		dataSource.setUsername("root");
		dataSource.setPassword("root_password");
		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
}
