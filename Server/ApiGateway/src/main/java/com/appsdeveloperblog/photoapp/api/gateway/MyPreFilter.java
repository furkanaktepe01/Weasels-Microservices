package com.appsdeveloperblog.photoapp.api.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class MyPreFilter implements GlobalFilter, Ordered {

	final Logger logger = LoggerFactory.getLogger(MyPreFilter.class);
	
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		
		logger.info("MyPreFilter:filter: executed.");
		
		ServerHttpRequest request = exchange.getRequest();
		
		logger.info("Request path: " + request.getPath().toString());
		
		HttpHeaders headers = request.getHeaders();
		
		headers.keySet().forEach(headerName -> {
	
			String headerValue = headers.getFirst(headerName);
			logger.info("Request header: " + headerName + " - " + headerValue);
		});
		
		return chain.filter(exchange);
	}

	@Override
	public int getOrder() {
		// execute firstly
		return 0;
	}

}
