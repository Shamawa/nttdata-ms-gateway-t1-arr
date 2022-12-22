package com.nttdata.msgatewayt1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 
 * @author Alexandra Rodríguez
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MsGatewayT1Application {

	public static void main(String[] args) {
		SpringApplication.run(MsGatewayT1Application.class, args);
	}

}
