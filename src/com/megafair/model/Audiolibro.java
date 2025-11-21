/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.megafair.model;

import java.util.List;

public class Audiolibro extends Libro {

    private Narrador narrador;
    private double duracion;

    public Audiolibro(String isbn, String titulo, double valor, List<Autor> autores, Editorial editorial, Narrador narrador, double duracion) {
        super(isbn, titulo, valor, autores, editorial);
        this.narrador = narrador;
        this.duracion = duracion;
    }

    public Narrador getNarrador() { return narrador; }
    public double getDuracion() { return duracion; }

    @Override
    public String getFormato() { return "AUDIO"; }

    @Override
    public Audiolibro clone() {
        return new Audiolibro(getIsbn(), getTitulo(), getValor(), getAutores(), getEditorial().clone(), narrador.clone(), duracion);
    }
}

