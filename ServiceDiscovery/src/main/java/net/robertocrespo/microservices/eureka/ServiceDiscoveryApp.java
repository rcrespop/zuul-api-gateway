package net.robertocrespo.microservices.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * All you need to run a Eureka registration server.
 * 
 * @author Roberto Crespo
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryApp {

	/**
	 * Run the application to run an Eureka Server 
	 * 
	 * @param args
	 *            Program arguments - ignored. XX
	 */
	public static void main(String[] args) {

		SpringApplication.run(ServiceDiscoveryApp.class, args);
	}
}
