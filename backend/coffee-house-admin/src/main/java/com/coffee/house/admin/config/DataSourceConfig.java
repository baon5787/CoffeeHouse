package com.coffee.house.admin.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	
	@Bean 
    public DataSource getDataSource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://www.db4free.net:3306/coffeehouse");
        dataSourceBuilder.username("nguyendinhbao");
        dataSourceBuilder.password("nguyendinhbao");
        return dataSourceBuilder.build();
    }
}
