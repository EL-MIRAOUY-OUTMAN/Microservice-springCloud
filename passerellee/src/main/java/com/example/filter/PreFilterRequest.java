package com.example.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Configuration
public class PreFilterRequest implements GlobalFilter {

    Logger logger= LoggerFactory.getLogger(PreFilterRequest.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request =exchange.getRequest();
        logger.info("Authorization : "+request.getHeaders().getFirst("Authorization"));
        System.out.println(request.getHeaders().getFirst("Authorization"));
        return chain.filter(exchange);
    }
}
