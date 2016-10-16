package isegundo.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@RestController
public class ControllerThree
{

	@Autowired
	@LoadBalanced
	protected RestTemplate restTemplate;
	
	@RequestMapping(value="/messageNoFallBack")
	public String message1()
	{
		return restTemplate.getForObject("http://SERVICE-ONE", String.class) ;
	
	}
	
	@HystrixCommand(fallbackMethod = "reliable")
	@RequestMapping(value="/message")
	public String message3()
	{
		return restTemplate.getForObject("http://SERVICE-ONE", String.class) ;
	
	}
	
	public String reliable()
	{
		return "Oops. This is the fallback in service-three";
	}
	
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
