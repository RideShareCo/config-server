package io.mcore.ride.sharing.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RideSharingConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RideSharingConfigServerApplication.class, args);
	}
}
