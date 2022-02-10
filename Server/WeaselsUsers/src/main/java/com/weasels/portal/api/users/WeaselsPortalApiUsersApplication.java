package com.weasels.portal.api.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.client.RestTemplate;

import feign.Logger;

@SpringBootApplication(scanBasePackages = {"com.weasels.portal.api"})
@EnableDiscoveryClient
public class WeaselsPortalApiUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeaselsPortalApiUsersApplication.class, args);
	}

}
