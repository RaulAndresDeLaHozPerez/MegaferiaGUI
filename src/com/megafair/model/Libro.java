/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.megafair.model;

import java.util.*;

public abstract class Libro implements Cloneable {

    private String isbn;
    private String titulo;
    private double valor;
    private List<Autor> autores;
    private Editorial editorial;

    public Libro(String isbn, String titulo, double valor, List<Autor> autores, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.valor = valor;
        this.autores = autores;
        this.editorial = editorial;
    }

    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public double getValor() { return valor; }
    public List<Autor> getAutores() { return autores; }
    public Editorial getEditorial() { return editorial; }

    public abstract String getFormato();

    @Override
    public abstract Libro clone();
}

