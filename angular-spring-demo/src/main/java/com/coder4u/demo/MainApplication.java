package com.coder4u.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class, UserDetailsServiceAutoConfiguration.class })
/*ComponentScan will scan your will scan your objects and will register with spring.*/
@ComponentScan("com.coder4u")
/*EntityScan: As you added @Entity annotation on your model object class Spring will assume that a table will exists with name Message. So to register this class with spring as Entity you need to use this annotation.*/
@EntityScan(basePackages={"com.coder4u"})
/*EnableJpaRepositories will enable all your spring jpa repositories to be used in your application.*/
@EnableJpaRepositories(basePackages={"com.coder4u"})
public class MainApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		/*To turn off automatic restart when any file resources changes in classpath*/
		//System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(MainApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MainApplication.class);
	}
}
