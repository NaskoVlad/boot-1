package ru.netology.boot1.server;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class JavaConfig {
    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev",
            havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }


    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev",
            havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
