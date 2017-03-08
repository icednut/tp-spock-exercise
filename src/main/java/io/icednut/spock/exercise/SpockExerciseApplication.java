package io.icednut.spock.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpockExerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpockExerciseApplication.class, args);
    }
}
