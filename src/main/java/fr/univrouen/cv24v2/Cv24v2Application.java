package fr.univrouen.cv24v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "fr.univrouen.cv24v2.repository") //Environnement utilisant JPA
public class Cv24v2Application {

    public static void main(String[] args) {

        //System.getProperties().put("server.port", 8100);
        SpringApplication.run(Cv24v2Application.class, args);
    }

}
