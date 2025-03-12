package org.example.api_mongodb.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Libro {
    private String id;
    private String titulo;
    private Double preco;

    public Libro() {
    }

    public Libro(String id, String titulo, Double preco) {
        this.id = id;
        this.titulo = titulo;
        this.preco = preco;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
