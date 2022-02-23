package com.test.testapi;

import com.test.testapi.service.MyUserDetailsService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.test.testapi.model.User;
import com.test.testapi.service.UserService;
import org.springframework.security.core.userdetails.UserDetailsService;

@SpringBootApplication
public class TestapiApplication 
{

	public static void main(String[] args) {
		SpringApplication.run(TestapiApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(UserService userService)
//	{
//		return args -> 
//		{
//			userService.addUser(new User("John Max","John","johnmax@gmail.com","2434","India"));
//			userService.addUser(new User("Bob Marley","Bob","bobmarly@gmail.com","9899","South Africa"));
//			userService.addUser(new User("Steven Jobs","Steven","stevenjobs@gmail.com","3498","France"));
//			userService.addUser(new User("Maria carey","Maria","mariacarey@gmail.com","3883","USA"));
//		};
//		
//	}
	@Bean
	public UserDetailsService userDetailsService()
	{
        return new MyUserDetailsService();
	}

}
