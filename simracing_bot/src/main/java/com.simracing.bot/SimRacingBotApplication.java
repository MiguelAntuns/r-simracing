package main.java.com.simracing.bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SimRacingBotApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimRacingBotApplication.class, args);
    }
}