package com.weasels.portal.api.actions;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class WeaselsPortalApiActionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeaselsPortalApiActionsApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {

		ModelMapper modelMapper = new ModelMapper();

		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		return modelMapper;
	}

}
