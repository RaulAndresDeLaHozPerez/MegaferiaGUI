/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.megafair.util;

public class Response<T> {
    public static final int OK = 0;
    public static final int ERROR = 1;

    private final int status;
    private final String message;
    private final T data;

    public Response(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus() { return status; }
    public String getMessage() { return message; }
    public T getData() { return data; }

    public boolean isOk() { return status == OK; }
}

