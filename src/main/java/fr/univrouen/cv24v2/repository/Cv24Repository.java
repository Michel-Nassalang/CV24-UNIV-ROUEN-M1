package fr.univrouen.cv24v2.repository;

import fr.univrouen.cv24v2.entity.Cv24Entity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
/**
 * Cette interface définit un référentiel pour les entités Cv24 (Cv24Entity).
 * Elle étend CrudRepository, fournissant ainsi des méthodes CRUD de base pour les entités Cv24.
 * Elle fournit également des méthodes personnalisées pour rechercher des entités Cv24 par ID et par genre, prénom et nom.
 */
public interface Cv24Repository extends CrudRepository<Cv24Entity, Integer> {
    /**
     * Recherche une entité Cv24 par son ID.
     *
     * @param id l'ID de l'entité Cv24
     * @return l'entité Cv24 correspondante, s'il existe
     */
    Cv24Entity findById(int id);
    /**
     * Recherche une entité Cv24 par son genre, prénom et nom.
     *
     * @param genre  le genre de l'identité de l'entité Cv24
     * @param prenom le prénom de l'identité de l'entité Cv24
     * @param nom    le nom de l'identité de l'entité Cv24
     * @return l'entité Cv24 correspondante, s'il existe
     */
    @Query("SELECT c FROM Cv24Entity c WHERE c.identite.genre = :genre AND c.identite.prenom = :prenom AND c.identite.nom = :nom")
    Optional<Cv24Entity> findByGenreAndPrenomAndNom(String genre, String prenom, String nom);
}
