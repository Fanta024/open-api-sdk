package com.fanta.fantaclientsdk;

import com.fanta.fantaclientsdk.client.FantaClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("fanta.client")
@Data
@ComponentScan
public class FantaClientConfig {
    private String accessKey;
    private String secretKey;

    @Bean
    public FantaClient fantaClient() {
        return new FantaClient(accessKey, secretKey);
    }
}
