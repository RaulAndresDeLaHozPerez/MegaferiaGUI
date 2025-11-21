/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.megafair.model;

import com.megafair.model.*;
import java.util.*;

public class LibroRepository {

    private final List<Libro> libros = new ArrayList<>();

    public void add(Libro l) {
        libros.add(l);
    }

    public boolean exists(String isbn) {
        return libros.stream().anyMatch(l -> l.getIsbn().equals(isbn));
    }

    public List<Libro> getAll() {
        return new ArrayList<>(libros);
    }

    public List<Libro> getAllOrdered() {
        List<Libro> list = new ArrayList<>(libros);
        list.sort(Comparator.comparing(Libro::getIsbn));
        return list;
    }

    public List<Libro> buscarPorAutor(long idAutor) {
        List<Libro> r = new ArrayList<>();
        for (Libro l : libros) {
            if (l.getAutores().stream().anyMatch(a -> a.getId() == idAutor))
                r.add(l);
        }
        r.sort(Comparator.comparing(Libro::getIsbn));
        return r;
    }

    public List<Libro> buscarPorFormato(String formato) {
        List<Libro> r = new ArrayList<>();
        for (Libro l : libros) {
            if (l.getFormato().equalsIgnoreCase(formato))
                r.add(l);
        }
        r.sort(Comparator.comparing(Libro::getIsbn));
        return r;
    }

    public List<Autor> autoresConMasEditoriales() {
        Map<Autor, Set<String>> mapa = new HashMap<>();

        for (Libro l : libros) {
            for (Autor a : l.getAutores()) {
                mapa.putIfAbsent(a, new HashSet<>());
                mapa.get(a).add(l.getEditorial().getNit());
            }
        }

        int max = mapa.values().stream().mapToInt(Set::size).max().orElse(0);

        List<Autor> r = new ArrayList<>();
        for (Autor a : mapa.keySet()) {
            if (mapa.get(a).size() == max)
                r.add(a);
        }

        r.sort(Comparator.comparingLong(Autor::getId));
        return r;
    }
}


