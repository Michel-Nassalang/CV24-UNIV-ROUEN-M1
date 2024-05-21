package fr.univrouen.cv24v2;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * Classe ServletInitializer pour configurer l'application Spring Boot.
 * <p>
 * Cette classe est utilisée pour configurer l'application lorsque
 * celle-ci est déployée en tant que servlet dans un conteneur de servlets.
 * Elle étend SpringBootServletInitializer et surcharge la méthode configure.
 * </p>
 */
public class ServletInitializer extends SpringBootServletInitializer {
    /**
     * Configure l'application pour le déploiement dans un conteneur de servlets.
     *
     * @param application un constructeur SpringApplicationBuilder
     * @return un constructeur SpringApplicationBuilder configuré
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Cv24v2Application.class);
    }

}
