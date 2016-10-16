package isegundo.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableAutoConfiguration
@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication
public class SpringServiceThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServiceThreeApplication.class, args);
	}
}
