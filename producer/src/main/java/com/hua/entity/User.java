package com.hua.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return id + " -> " + name + " -> ";
    }
}
