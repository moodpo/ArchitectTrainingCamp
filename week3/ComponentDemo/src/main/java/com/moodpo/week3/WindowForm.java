package com.moodpo.week3;

import lombok.Data;

/**
 * User: moodpo
 * Date: 2020-06-24 20:21
 */
@Data
public class WindowForm extends Window {

    WindowForm(String name) {
        super(name);
    }

    private Picture logo;

    private Button loginButton;

    private Button signButton;

    private Frame frame;

}
