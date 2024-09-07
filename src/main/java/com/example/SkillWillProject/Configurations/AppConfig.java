package com.example.SkillWillProject.Configurations;

import com.example.SkillWillProject.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public User defaultuser()
    {
        return new User(3L,"Maria");
    }

}
