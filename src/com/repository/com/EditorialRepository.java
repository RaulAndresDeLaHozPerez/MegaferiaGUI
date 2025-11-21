/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repository.com;

import com.megafair.model.*;
import com.megafair.model.Editorial;
import java.util.*;

public class EditorialRepository {

    private final List<Editorial> editoriales = new ArrayList<>();

    public void add(Editorial e) {
        editoriales.add(e);
    }

    public boolean exists(String nit) {
        return editoriales.stream().anyMatch(e -> e.getNit().equals(nit));
    }

    public Editorial getByNit(String nit) {
        return editoriales.stream()
                .filter(e -> e.getNit().equals(nit))
                .findFirst()
                .orElse(null);
    }

    public List<Editorial> getAll() {
        return new ArrayList<>(editoriales);
    }

    public List<Editorial> getAllOrdered() {
        List<Editorial> list = new ArrayList<>(editoriales);
        list.sort(Comparator.comparing(Editorial::getNit));
        return list;
    }
}


