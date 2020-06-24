package com.moodpo.week3;

import lombok.Data;

/**
 * User: moodpo
 * Date: 2020-06-24 20:34
 */
@Data
public abstract class Window {

    private String name;

    public Window(String name) {
        this.name = name;
        this.print();
    }

    private String getType() {
        return this.getClass().getSimpleName();
    }

    private void print() {
        System.out.println(String.format("print %s(%s)", this.getType(), this.getName()));
    }

}
