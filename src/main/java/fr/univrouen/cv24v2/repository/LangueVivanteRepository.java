package fr.univrouen.cv24v2.repository;

import fr.univrouen.cv24v2.entity.LangueVivanteEntity;
import org.springframework.data.repository.CrudRepository;
/**
 * Cette interface définit un référentiel pour les entités de langue vivante (LangueVivanteEntity).
 * Elle étend CrudRepository, fournissant ainsi des méthodes CRUD de base pour les entités de langue vivante.
 * Cette interface fournit des méthodes CRUD (Create, Read, Update, Delete) prêtes à l'emploi pour interagir avec la base de données concernant les entités de langue vivante.
 */
public interface LangueVivanteRepository extends CrudRepository<LangueVivanteEntity, Integer> {
}
