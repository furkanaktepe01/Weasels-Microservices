package com.appsdeveloperblog.photoapp.api.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import reactor.core.publisher.Mono;

@Configuration
public class GlobalFiltersConfig {

	final Logger logger = LoggerFactory.getLogger(GlobalFiltersConfig.class);
	
	@Bean
	@Order(1)
	public GlobalFilter pseudoFilter_0() {
		
		return (exchange, chain) -> {
			
			logger.info("pseudoFilter_0: pre");
			
			return chain.filter(exchange).then(Mono.fromRunnable(() -> {
				
				logger.info("pseudoFilter_0: post");
			}));
		};
		
	}
	
	@Bean
	@Order(2)
	public GlobalFilter pseudoFilter_1() {
		
		return (exchange, chain) -> {
			
			logger.info("pseudoFilter_1: pre");
			
			return chain.filter(exchange).then(Mono.fromRunnable(() -> {
				
				logger.info("pseudoFilter_1: post");
			}));
		};

	}
	
}
