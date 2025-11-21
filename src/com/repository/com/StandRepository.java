/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repository.com;

import com.megafair.model.*;
import com.megafair.model.Stand;
import com.megafair.util.Response;
import java.util.*;

public class StandRepository {

    private final List<Stand> stands = new ArrayList<>();

    public Response<Stand> add(Stand s) {
        stands.add(s);
        return new Response<>(Response.OK, "Stand registrado", s);
    }

    public boolean exists(long id) {
        return stands.stream().anyMatch(s -> s.getId() == id);
    }

    public Stand getById(long id) {
        for (Stand s : stands) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    public List<Stand> getAll() {
        return new ArrayList<>(stands);
    }

    public List<Stand> getAllOrdered() {
        List<Stand> list = new ArrayList<>(stands);
        list.sort(Comparator.comparingLong(Stand::getId));
        return list;
    }
}




