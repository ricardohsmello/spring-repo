package br.com.ricas.sample.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;

@Configuration
public class AppConfig {

    @Bean
    public MongoClientFactoryBean mongo() {
       MongoClientFactoryBean factory = new MongoClientFactoryBean();
        factory.setHost("localhost");
        return factory;
    }
}
