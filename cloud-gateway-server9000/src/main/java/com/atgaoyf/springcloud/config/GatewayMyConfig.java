package com.atgaoyf.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Configuration;

/**
 * @author gaoyf
 * @Desc //TODO添加描述
 * @Date 2021/3/18 9:47
 */
@Configuration
public class GatewayMyConfig {

    //@Bean
    public RouteLocator customRoute(RouteLocatorBuilder routeLocatorBuilder) {

        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("payment-service", r -> r.path("/payment/**").uri("lb://cloud-payment"));

        return routes.build();
    }
}
