package view;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {

    private JPanel panel;
    private JLabel labelLogin;
    private JLabel labelID;
    private JLabel labelPWD;
    private JTextField textFieldID;
    private JPasswordField passwordField;
    private JButton btnLogin;
    private JButton btnRegister;
    private JButton btnExit;

    public LoginView() {
        super("Login");
        setSize(350, 400);
        super.setResizable(true);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        setContentPane(panel);

        labelLogin = new JLabel("Login");
        labelLogin.setFont(new Font("Serif", Font.BOLD, 13));
//        labelLogin.setHorizontalAlignment();
    }
}
