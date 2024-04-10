package fr.univrouen.cv24v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Cv24v2Application {

    public static void main(String[] args) {

        //System.getProperties().put("server.port", 8100);
        SpringApplication.run(Cv24v2Application.class, args);
    }

}
