package com.moodpo.week3;

/**
 * User: moodpo
 * Date: 2020-06-24 20:20
 */
public class Demo {

    public static void main(String[] args) {

        WindowForm windowForm = new WindowForm("WINDOW窗口");
        windowForm.setLogo(new Picture("LOGO图片"));
        windowForm.setLoginButton(new Button("登录"));
        windowForm.setSignButton(new Button("注册"));

        Frame frame = new Frame("FRAME1");
        frame.setUsername(new Lable("用户名"));
        frame.setTextBox(new TextBox("文本框"));
        frame.setPassword(new Lable("密码"));
        frame.setPasswordBox(new PasswordBox("密码框"));
        frame.setCheckBox(new CheckBox("复选框"));
        frame.setForget(new TextBox("忘记用户名"));
        frame.setLinkLable(new LinkLable("忘记密码"));

        windowForm.setFrame(frame);
    }

}
