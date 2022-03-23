package com.chana.beans;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	          .antMatcher("/**")
	          .authorizeRequests()
	            .antMatchers("/", "/callback", "/login**", "/webjars/**", "/error**","/oauth/token")
	                .permitAll()
	                .antMatchers("/**","/callback","/else/**").authenticated()
	          .anyRequest()
	            .authenticated();
	    }
}
