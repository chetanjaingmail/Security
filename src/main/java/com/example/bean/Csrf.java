package com.example.bean;

import java.net.PasswordAuthentication;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
public class Csrf extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http)throws Exception {
		
		http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().formLogin();
	}
	
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth)throws Exception{
		auth.inMemoryAuthentication()
		.withUser("admin")
		.password("{noop}admin@123")
		.roles("ADMIN");
	}

}
