package org.sfg.brewery.msscinventoryfailover;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@EnableEurekaClient
@SpringBootApplication(exclude = ArtemisAutoConfiguration.class)
public class MsscInventoryFailoverApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscInventoryFailoverApplication.class, args);
    }

    @Bean
    CommandLineRunner generateRandomUUID() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                System.out.println(UUID.randomUUID());
            }
        };
    }
}
