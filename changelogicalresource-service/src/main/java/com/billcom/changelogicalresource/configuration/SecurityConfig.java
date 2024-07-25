package com.billcom.changelogicalresource.configuration;


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



/**
 * Configures the security settings for the application by extending the WebSecurityConfigurerAdapter.
 * This class provides a base implementation for custom security configurations.
 * It allows customization of authentication and authorization rules for the application.
 */
@ComponentScan({"com.billcom.changelogicalresource.configuration"})
@Configuration
@EnableWebSecurity
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Value("${msusername}")
	String usernamesc;
	@Value("${mspassword}")
	String passwordsc;

	/**
	 * Configures the security settings and rules for the application.
	 *
	 * @param http The HttpSecurity object used to customize the security configuration.
	 * @throws Exception If an error occurs during the configuration process.
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().and().csrf().disable().authorizeRequests()
				.anyRequest().authenticated()
				.and().httpBasic().and()
				.exceptionHandling();

	}
	/**
	 * Configures the global authentication settings for the application.
	 *
	 * @param auth The AuthenticationManagerBuilder object used to configure authentication.
	 * @throws Exception If an error occurs during the configuration process.
	 */
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication()
				.withUser(usernamesc)
				.password(new BCryptPasswordEncoder().encode(passwordsc)).roles("USER");

	}


	/**
	 * Creates a passwordEncoder bean for password encoding.
	 *
	 * @return An instance of PasswordEncoder for password encoding.
	 */
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}


} 



