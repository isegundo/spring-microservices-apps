package isegundo.microservices;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@Component
public class ControllerOne
{
    @Value("${server.port}")
    int port;
 

	@RequestMapping(value="/")
	public String message() throws UnknownHostException
	{
		return "Message from One" + " Port: " + port + " hostname: " + InetAddress.getLocalHost().getHostName();
		
	}
	
}
