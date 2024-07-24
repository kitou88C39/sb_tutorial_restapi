package com.codingshuffle.tutorial.configuration;

import com.codingshuffle.tutorial.DB;
import com.codingshuffle.tutorial.DevDB;
import com.codingshuffle.tutorial.ProdDB;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@Configurable
public class AppConfig {

    @Bean
    @ConditionalOnProperty(name = "project.name", havingValue = "development")
    public DB getDevDBBean() {
        return new DevDB();
    }

    @Bean
    @ConditionalOnProperty(name = "project.name", havingValue = "development")
    public DB getProdDBBean() {
        return new ProdDB();
    }
}
