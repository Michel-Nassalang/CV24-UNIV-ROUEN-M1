package fr.univrouen.cv24v2.repository;

import fr.univrouen.cv24v2.entity.AutreEntity;
import org.springframework.data.repository.CrudRepository;
/**
 * Interface pour la gestion des entités AutreEntity.
 * Cette interface fournit des méthodes CRUD (Create, Read, Update, Delete) prêtes à l'emploi pour interagir avec la base de données concernant les entités
 */
public interface AutreRepository extends CrudRepository<AutreEntity, Integer> {
}
