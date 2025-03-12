package org.example.api_mongodb.service;

import org.example.api_mongodb.model.Libro;
import org.example.api_mongodb.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public List<Libro> findAll() {
        return libroRepository.findAll();
    }

    public Libro findOne(String id) {
        return libroRepository.findById(id).orElse(null);
    }

    public Libro save(Libro libro) {
        return libroRepository.save(libro);
    }


    public void deleteById(String id) {
        libroRepository.deleteById(id);
    }

    public void deleteAll() {
        libroRepository.deleteAll();
    }

}
