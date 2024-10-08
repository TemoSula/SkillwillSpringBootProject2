package com.example.SkillWillProject;

import com.example.SkillWillProject.Services.UserService;
import com.example.SkillWillProject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class SkillWillProjectApplication {

	private final UserService userService;
	private final User defaultUser;

	@Autowired
	public SkillWillProjectApplication(UserService userService, User defaultUser) {
		this.userService = userService;
		this.defaultUser = defaultUser;
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SkillWillProjectApplication.class, args);
		SkillWillProjectApplication app = context.getBean(SkillWillProjectApplication.class);
		app.run();
	}

	public void run() {
		// yvela users vachvenebt ase
		userService.getAllUsers().forEach(System.out::println);

		// axali useris damateba
		User newUser = new User(4L, "David");
		userService.addUser(newUser);

		// axlidan bachvenebt users rata gavigot rom martlac daemata axali useri
		userService.getAllUsers().forEach(System.out::println);

		// amit vachvenebt default user
		System.out.println("Default user: " + defaultUser);
	}
}
