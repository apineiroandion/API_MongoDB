package org.example.api_mongodb.controller;

import org.example.api_mongodb.model.Libro;
import org.example.api_mongodb.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> getAllLibros() {
        return libroService.findAll();
    }

    @GetMapping("/{id}")
    public Libro getLibroById(@PathVariable String id) {
        return libroService.findOne(id);
    }

    @PostMapping
    public Libro createLibro(@RequestBody Libro libro) {
        return libroService.save(libro);
    }

    @PutMapping("/{id}")
    public Libro updateLibro(@PathVariable String id, @RequestBody Libro libro) {
        libro.setId(id);
        return libroService.save(libro);
    }

    @DeleteMapping("/{id}")
    public void deleteLibro(@PathVariable String id) {
        libroService.deleteById(id);
    }

    @DeleteMapping
    public void deleteAllLibros() {
        libroService.deleteAll();
    }
}