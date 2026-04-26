
import java.awt.*;
import java.awt.event.*;

class LoginAWT extends Frame implements ActionListener {

    TextField username;
    TextField password;
    Button login, reset;

    LoginAWT() {
        setTitle("Login Window");
        setSize(300, 200);
        setLayout(new GridLayout(3, 2, 5, 5));

        Label l1 = new Label("Username:");
        Label l2 = new Label("Password:");

        username = new TextField();
        password = new TextField();
        password.setEchoChar('*'); // hides password

        login = new Button("Login");
        reset = new Button("Reset");

        add(l1);
        add(username);
        add(l2);
        add(password);
        add(login);
        add(reset);

        login.addActionListener(this);
        reset.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == login) {
            String user = username.getText();
            String pass = password.getText();

            if (user.equals("admin") && pass.equals("1234")) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Invalid Username or Password");
            }
        }

        if (e.getSource() == reset) {
            username.setText("");
            password.setText("");
        }
    }
}

public class ass21 {
    public static void main(String[] args) {
        new LoginAWT();
    }
}
