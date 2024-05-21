package fr.univrouen.cv24v2.repository;

import fr.univrouen.cv24v2.entity.DetailExperienceEntity;
import org.springframework.data.repository.CrudRepository;
/**
 * Cette interface définit un référentiel pour les entités de détail d'expérience (DetailExperienceEntity).
 * Elle étend CrudRepository, fournissant ainsi des méthodes CRUD de base pour les entités de détail d'expérience.
 * Cette interface fournit des méthodes CRUD (Create, Read, Update, Delete) prêtes à l'emploi pour interagir avec la base de données concernant les entités de détail d'expérience.
 */
public interface DetailExperienceRepository extends CrudRepository<DetailExperienceEntity, Integer> {
}
