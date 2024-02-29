package com.example.RestApiMySQLSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class RestApiMySqlSpringBootApplication
{

	public static void main(String[] args)
	{

		SpringApplication.run(RestApiMySqlSpringBootApplication.class, args);
	}
	public static class Myconfiguration
	{
		@Bean
		public WebMvcConfigurer corsConfigurer()
		{
			return new WebMvcConfigurer()
			{
				@Override
				public void addCorsMappings(CorsRegistry registry)
				{
					registry.addMapping("/**")
							.allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH");
				}
			};
		}
	}
}
