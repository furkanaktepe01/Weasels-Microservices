package com.weasels.portal.api.users.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

	@Bean
	PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}
	
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
    	httpSecurity.csrf().disable();
        httpSecurity.authorizeRequests().antMatchers("/").permitAll();
        
        // h2-console config
        httpSecurity.headers().frameOptions().sameOrigin();
    }

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("CEO@weasels.io")
			.password("{noop}CEO12345678")
			.roles("CEO")
			.and()
			.withUser("MM@weasels.io")
			.password("{noop}MM12345678")
			.roles("MISSION_MANAGER")
			.and()
			.withUser("DS@weasels.io")
			.password("{noop}DS12345678")
			.roles("DEPARTMENT_SUPERVISOR")
			.and()
			.withUser("TL@weasels.io")
			.password("{noop}TL12345678")
			.roles("TEAM_LEAD")
			.and()
			.withUser("EMP@weasels.io")
			.password("{noop}EMP12345678")
			.roles("EMPLOYEE");
	}
}
