/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.megafair.model;

import java.util.List;

public class LibroImpreso extends Libro {

    private int paginas;

    public LibroImpreso(String isbn, String titulo, double valor, List<Autor> autores, Editorial editorial, int paginas) {
        super(isbn, titulo, valor, autores, editorial);
        this.paginas = paginas;
    }

    public int getPaginas() { return paginas; }

    @Override
    public String getFormato() { return "IMPRESO"; }

    @Override
    public LibroImpreso clone() {
        return new LibroImpreso(getIsbn(), getTitulo(), getValor(), getAutores(), getEditorial().clone(), paginas);
    }
}

