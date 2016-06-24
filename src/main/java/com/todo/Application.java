package com.todo;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.thymeleaf.TemplateEngine;

/**
 * Created by sebastian on 23.06.16.
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {

        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.addDialect(new LayoutDialect());

        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

    }
}
