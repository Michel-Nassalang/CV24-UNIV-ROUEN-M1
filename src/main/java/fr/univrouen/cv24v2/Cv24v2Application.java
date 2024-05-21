package fr.univrouen.cv24v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Classe principale de l'application Spring Boot pour CV24v2.
 * <p>
 * Cette classe configure et démarre l'application Spring Boot.
 * Elle active également la gestion des transactions et les repositories JPA.
 * </p>
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "fr.univrouen.cv24v2.repository", enableDefaultTransactions = true) //Environnement utilisant JPA
public class Cv24v2Application {
    /**
     * Méthode principale pour démarrer l'application Spring Boot.
     *
     * @param args Arguments de la ligne de commande
     */
    public static void main(String[] args) {

        // Décommenter la ligne suivante pour changer le port du serveur
        // System.getProperties().put("server.port", 8100);
        SpringApplication.run(Cv24v2Application.class, args);
    }

}
