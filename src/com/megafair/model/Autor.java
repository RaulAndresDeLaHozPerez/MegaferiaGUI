/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.megafair.model;

public class Autor extends Persona {

    public Autor(long id, String nombre) {
        super(id, nombre);
    }

    @Override
    public Autor clone() {
        return new Autor(getId(), getNombre());
    }
}

