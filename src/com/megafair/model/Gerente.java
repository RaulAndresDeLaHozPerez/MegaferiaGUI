/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.megafair.model;

public class Gerente extends Persona {

    public Gerente(long id, String nombre) {
        super(id, nombre);
    }

    @Override
    public Gerente clone() {
        return new Gerente(getId(), getNombre());
    }
}

