package org.example.api_mongodb.repository;

import org.example.api_mongodb.model.Libro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends MongoRepository<Libro, String> {
}
