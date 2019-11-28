package com.Gentelella;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	private AuthenticationSuccessHandler authenticationSuccessHandler;
	 
    @Autowired
    public SecurityConfiguration(AuthenticationSuccessHandler authenticationSuccessHandler) {
        this.authenticationSuccessHandler = authenticationSuccessHandler;
    }

	public void configure(HttpSecurity http) throws Exception{
		http
			.authorizeRequests()
			.antMatchers("/build/**","/css/**","/images/**","/js/**","/src/**","/vendors/**").permitAll()
			.antMatchers("/index").hasRole("ADMIN")
			.antMatchers("/index2").hasAnyRole("USER2","ADMIN")
			.antMatchers("/index3").hasAnyRole("USER3","ADMIN")
			.anyRequest().authenticated()
			.and()
			.formLogin()
				.failureUrl("/login?error")
				.loginPage("/login")
				.successHandler(authenticationSuccessHandler)
			.and()
			.logout()
				.logoutUrl("/logout")
				.logoutSuccessUrl("/login")
				.permitAll();
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication()
			.withUser("user1").password("{noop}user1").roles("ADMIN")
			.and()
			.withUser("user3").password("{noop}user3").roles("USER3")
			.and()
			.withUser("user2").password("{noop}user2").roles("USER2");
	}
}
