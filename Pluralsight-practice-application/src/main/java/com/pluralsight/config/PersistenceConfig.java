package com.pluralsight.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class PersistenceConfig {
@Bean
	public DataSource datasource() {
	DataSourceBuilder builder =DataSourceBuilder.create();
	builder.url("jdbc:postgresql://localhost:5432/conference");
	builder.username("postgres");
	builder.password("admin");
	System.out.println("Customdatasouce BEAN HAS BEEN INITIALIZED");
	return builder.build();
	
	}
}
