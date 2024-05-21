package fr.univrouen.cv24v2.repository;

import fr.univrouen.cv24v2.entity.ProfEntity;
import org.springframework.data.repository.CrudRepository;
/**
 * Cette interface définit un référentiel pour les entités d'expériences professionnelles (ProfEntity).
 * Elle étend CrudRepository, fournissant ainsi des méthodes CRUD de base pour les entités d'expériences professionnelles.
 * Cette interface fournit des méthodes CRUD (Create, Read, Update, Delete) prêtes à l'emploi pour interagir avec la base de données concernant les entités d'expériences professionnelles.
 */
public interface ProfRepository extends CrudRepository<ProfEntity, Integer> {
}
