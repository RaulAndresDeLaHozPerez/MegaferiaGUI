/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.megafair.model;

import java.util.List;

public class LibroDigital extends Libro {

    private String enlace;

    public LibroDigital(String isbn, String titulo, double valor, List<Autor> autores, Editorial editorial, String enlace) {
        super(isbn, titulo, valor, autores, editorial);
        this.enlace = enlace;
    }

    public String getEnlace() { return enlace; }

    @Override
    public String getFormato() { return "DIGITAL"; }

    @Override
    public LibroDigital clone() {
        return new LibroDigital(getIsbn(), getTitulo(), getValor(), getAutores(), getEditorial().clone(), enlace);
    }
}

