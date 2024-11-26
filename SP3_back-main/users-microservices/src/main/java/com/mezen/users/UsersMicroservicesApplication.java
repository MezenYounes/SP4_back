package com.mezen.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.mezen.users.entities.Role;
import com.mezen.users.entities.User;
import com.mezen.users.service.UserService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class UsersMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersMicroservicesApplication.class, args);
	}
	
	@Autowired
	UserService userService;

	/*
	 * @PostConstruct void init_users() { //ajouter les rôles
	 * userService.addRole(new Role(null,"ADMIN")); userService.addRole(new
	 * Role(null,"USER")); //ajouter les users userService.saveUser(new
	 * User(null,"admin","123",true,null)); userService.saveUser(new
	 * User(null,"mezen","123",true,null)); userService.saveUser(new
	 * User(null,"aziz","123",true,null)); //ajouter les rôles aux users
	 * userService.addRoleToUser("admin", "ADMIN");
	 * userService.addRoleToUser("admin", "USER");
	 * userService.addRoleToUser("mezen", "USER"); userService.addRoleToUser("aziz",
	 * "USER"); }
	 */
	 


}
