package com.company.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author Fredi Hernandez
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.company.app")
public class AppConfig {

}
