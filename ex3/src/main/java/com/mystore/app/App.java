package com.mystore.app;


// App.java - Main Application Class
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Product product = context.getBean(Product.class);

        System.out.println(product);
    }
}
