package com.billcom.createcustomer.configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@ComponentScan({"com.billcom.createcustomer.configuration"})
@Configuration
@EnableWebSecurity
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Value("${ms.username}")
	String msUsername;
	@Value("${ms.password}")
	String msPassword;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().and().csrf().disable().authorizeRequests()
				.anyRequest().authenticated()
				.and().httpBasic().and()
				.exceptionHandling();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser(msUsername).password(new BCryptPasswordEncoder().encode(msPassword)).roles("USER");

	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}


} 



