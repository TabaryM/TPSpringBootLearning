package fr.masteril.tp3spring;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class Tp3SpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp3SpringApplication.class, args);
    }

}
