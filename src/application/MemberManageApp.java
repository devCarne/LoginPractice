package application;

import view.LoginView;

import java.awt.*;

public class MemberManageApp {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                LoginView loginView = new LoginView();
            } catch (Exception e) {
                e.printStackTrace();
            }
            }
        });
    }
}
