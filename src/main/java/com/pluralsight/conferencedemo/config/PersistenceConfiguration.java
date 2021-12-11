package com.pluralsight.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    /* This is configuration driven approach */
    /* The other way to te Spring about the psql data path by the Environmental
    variable by DB_URL=jdbc:postgresql://localhost:5432/conference_app */
/*    @Bean
    public DataSource dataSource() {
        DataSourceBuilder<?> builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/conference_app");
        System.out.println("My custom datasource bean has been initialized and set");
        return builder.build();
    }*/

}
