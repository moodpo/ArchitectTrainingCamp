package com.moodpo.week3;

import lombok.Data;

/**
 * User: moodpo
 * Date: 2020-06-24 20:22
 */
@Data
public class Frame extends Window {

    public Frame(String name) {
        super(name);
    }

    private Lable username;

    private TextBox textBox;

    private Lable password;

    private PasswordBox passwordBox;

    private CheckBox checkBox;

    private TextBox forget;

    private LinkLable linkLable;

}
