package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import controller.MainController;
import controller.account.RegisterController;

@Configuration
public class ControllerConfig {

	@Bean
	public MainController mainController() {
		return new MainController();
	}
	
	@Bean
	public RegisterController registerController() {
		return new RegisterController();
	}
	
}
