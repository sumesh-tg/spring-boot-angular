package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@PropertySource("classpath:application.properties")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Value("${spring.security.enabled}")
    private boolean securityEnabled;

    @Override
    public void configure(WebSecurity web) throws Exception {
    	System.out.println("called security ::::::::::::::::::::"+securityEnabled);
        if (securityEnabled)
            web.ignoring().anyRequest();
        else
            web.ignoring().antMatchers("/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        if (securityEnabled)
            http.csrf().disable().authorizeRequests()
                    .anyRequest().permitAll();
    }
}