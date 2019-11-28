package com.Gentelella;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	public void configure(HttpSecurity http) throws Exception{
		http
			.authorizeRequests()
			.antMatchers("/build/**","/css/**","/images/**","/js/**","/src/**","/vendors/**").permitAll()
			.antMatchers("/index").access("hasRole('ADMIN')")
			.antMatchers("/index1").access("hasRole('USER1')")
			.antMatchers("/index2").access("hasRole('USER2')")
			.and()
			.formLogin()
				.failureUrl("/login?error")
				.loginPage("/login")
				.loginProcessingUrl("/login")
				.usernameParameter("username")
				.passwordParameter("password")
			.and()
			.logout()
				.logoutUrl("/logout")
				.logoutSuccessUrl("/login");
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication()
			.withUser("admin").password("{noop}admin").roles("ADMIN")
			.and()
			.withUser("user1").password("{noop}user1").roles("USER1")
			.and()
			.withUser("user2").password("{noop}user2").roles("USER2");
	}
}
