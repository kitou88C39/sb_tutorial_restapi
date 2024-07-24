package com.codingshuffle.tutorial.configuration;

import com.codingshuffle.tutorial.DB;
import com.codingshuffle.tutorial.DevDB;
import com.codingshuffle.tutorial.ProdDB;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class AppConfig {

    @Bean
    public DB getDevDBBean() {
        return new DevDB();
    }

    @Bean
    public DB getProdDBBean() {
        return new ProdDB();
    }
}
