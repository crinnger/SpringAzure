package br.com.crinnnger.codeanywhere.SpringAzure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringAzureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureApplication.class, args);
	}

}
