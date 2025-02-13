package com.mystore.app;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Product tumblerProduct() {
        return new Product(1, "Tumbler", 150.0);
    }
    
    @Bean
    public Product bucketProduct() {
        return new Product(2, "Bucket", 250.0);
    }
}
