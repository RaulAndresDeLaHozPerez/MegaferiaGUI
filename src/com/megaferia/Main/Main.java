/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.megaferia.Main;
import com.megafair.controller.MegaferiaController;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            // En lugar de instanciar la Vista directamente,
            // instanciamos y ejecutamos el Controlador Principal.
            new MegaferiaController().iniciarAplicacion(); 
        });
    }
}



