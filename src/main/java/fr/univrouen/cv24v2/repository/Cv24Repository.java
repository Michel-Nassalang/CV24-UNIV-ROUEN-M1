package fr.univrouen.cv24v2.repository;

import fr.univrouen.cv24v2.entity.Cv24Entity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface Cv24Repository extends CrudRepository<Cv24Entity, Integer> {

    Cv24Entity findById(int id);

    @Query("SELECT c FROM Cv24Entity c WHERE c.identite.genre = :genre AND c.identite.prenom = :prenom AND c.identite.nom = :nom")
    Optional<Cv24Entity> findByGenreAndPrenomAndNom(String genre, String prenom, String nom);
}
