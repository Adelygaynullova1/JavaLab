package web;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class ProxyConfig {

    @Bean
    RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("tender_route",
                        route -> route.path("/tender/**")
                                .uri("lb://tender-service"))
                .route("order_route",
                        route -> route.path("/order/**")
                                .uri("lb://order-service"))

                .build();
    }
}
