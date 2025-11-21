/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repository.com;

import com.megafair.model.*;
import com.megafair.model.Autor;
import com.megafair.model.Gerente;
import com.megafair.model.Narrador;
import com.megafair.model.Persona;
import java.util.*;

public class PersonaRepository {

    private final List<Persona> personas = new ArrayList<>();

    public void add(Persona p) {
        personas.add(p);
    }

    public boolean exists(long id) {
        return personas.stream().anyMatch(p -> p.getId() == id);
    }

    public Persona getById(long id) {
        return personas.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Persona> getAll() {
        return new ArrayList<>(personas);
    }

    public List<Persona> getAllOrdered() {
        List<Persona> list = new ArrayList<>(personas);
        list.sort(Comparator.comparingLong(Persona::getId));
        return list;
    }

    public List<Autor> getAutores() {
        List<Autor> list = new ArrayList<>();
        for (Persona p : personas) {
            if (p instanceof Autor) {
                list.add((Autor) p);
            }
        }
        list.sort(Comparator.comparingLong(Autor::getId));
        return list;
    }

    public List<Gerente> getGerentes() {
        List<Gerente> list = new ArrayList<>();
        for (Persona p : personas) {
            if (p instanceof Gerente) {
                list.add((Gerente) p);
            }
        }
        list.sort(Comparator.comparingLong(Gerente::getId));
        return list;
    }

    public List<Narrador> getNarradores() {
        List<Narrador> list = new ArrayList<>();
        for (Persona p : personas) {
            if (p instanceof Narrador) {
                list.add((Narrador) p);
            }
        }
        list.sort(Comparator.comparingLong(Narrador::getId));
        return list;
    }
}


