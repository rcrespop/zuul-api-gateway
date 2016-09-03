package net.robertocrespo.microservices.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import net.robertocrespo.microservices.zuul.filters.PreFilter;


/**
 * All you need to run an API Gateway with Netfil Zuul
 * 
 * @author Roberto Crespo
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class EdgeServiceApp {

	public static void main(String[] args) {

		SpringApplication.run(EdgeServiceApp.class, args);

	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	

}
