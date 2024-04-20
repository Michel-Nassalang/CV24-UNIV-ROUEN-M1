package fr.univrouen.cv24v2.repository;

import fr.univrouen.cv24v2.entity.Cv24Entity;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface Cv24Repository extends CrudRepository<Cv24Entity, Integer> {
}
