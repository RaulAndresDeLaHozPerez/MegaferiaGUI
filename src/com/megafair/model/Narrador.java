/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.megafair.model;

public class Narrador extends Persona {

    public Narrador(long id, String nombre) {
        super(id, nombre);
    }

    @Override
    public Narrador clone() {
        return new Narrador(getId(), getNombre());
    }
}

