package isegundo.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@EnableAutoConfiguration
@EnableEurekaClient
@SpringBootApplication
public class SpringServiceOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServiceOneApplication.class, args);
	}
}
