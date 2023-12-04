package io.rkowsu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class KubernetesIntegrationApplication {

	@GetMapping("/hello")
	public String welcomeMessage() throws UnknownHostException {
		System.out.println("I am from " + InetAddress.getLocalHost().getHostAddress());
		return "<h1><b>Hello world....From Docker.!!!!!!</b></h1>";
	}


	public static void main(String[] args) {
		SpringApplication.run(KubernetesIntegrationApplication.class, args);
	}

}
