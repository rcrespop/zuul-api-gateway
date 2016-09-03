package net.robertocrespo.microservices.greeting;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * A RESTFul controller for accessing greeting.
 * 
 * @author Roberto Crespo
 */
@RestController
public class GreetingServiceController {
	
	
	private static final String template = "Hello, %s!";
	
	/**
	 * Say Hello
	 * 
	 * @param name
	 * @return a greeting "Hello" + name	
	 */	
	
	@RequestMapping("/greeting/{name}")
    public String greeting2(@PathVariable("name") String name) {
        return String.format(template, name) ;		
    }

}
