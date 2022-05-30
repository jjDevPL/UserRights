package com.jj.userrights;

import com.jj.userrights.configuration.GraphQLConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;

@SpringBootApplication
@PropertySource(value = "classpath:application.properties")
@Import(GraphQLConfiguration.class)
public class UserRightApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRightApplication.class, args);
	}
	@PostConstruct
    public void setup() {
	    int z=90;
	    z++;
    }

}
