package com.algaworks.festa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class InMemorySecurityConfig {
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
		builder.inMemoryAuthentication()
		.withUser("bruno").password("{noop}123").roles("ADMIN")
		.and()
		.withUser("joao").password("{noop}123").roles("USER")
		.and()
		.withUser("alex").password("{noop}123").roles("USER");			
	}
}
