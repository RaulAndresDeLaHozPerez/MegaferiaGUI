/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.megafair.util;

public class Validator {

    public static boolean validId(long id) {
        return id >= 0 && String.valueOf(id).length() <= 15;
    }

    public static boolean notEmpty(String s) {
        return s != null && !s.trim().isEmpty();
    }

    public static boolean positive(double n) {
        return n > 0;
    }

    public static boolean validNit(String nit) {
        if (nit == null) return false;
        return nit.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d");
    }

    public static boolean validIsbn(String isbn) {
        if (isbn == null) return false;
        return isbn.matches("\\d{3}-\\d-\\d{2}-\\d{6}-\\d");
    }
}




