package com.br.bookshelf.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

import com.br.bookshelf.login.LoggedUser;
import com.br.bookshelf.repository.UserRepository;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	protected void configure(AuthenticationManagerBuilder auth, UserRepository userRepository) throws Exception {
		auth.userDetailsService(email -> {
			return userRepository.findByEmail(email)
					.map(LoggedUser::new)
					.orElse(null);
		}).passwordEncoder(NoOpPasswordEncoder.getInstance());
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	

}
