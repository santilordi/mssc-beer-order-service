package guru.sfg.beer.order.service.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("local-disvovery")
@Configuration
@EnableAutoConfiguration
public class LocalDiscovery {
}
