import java.awt.*;
import java.awt.event.*;

class SimpleWindowAWT extends Frame implements ActionListener {
    Label label;
    TextField textField;
    Button button;

    SimpleWindowAWT() {
        setTitle("Simple AWT Window");
        setSize(400, 200);
        setLayout(new FlowLayout());

        label = new Label("Enter your name:");
        textField = new TextField(20);
        button = new Button("Submit");

        add(label);
        add(textField);
        add(button);

        button.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = textField.getText();
        label.setText("Hello, " + name);
    }
}

public class ass20 {
    public static void main(String[] args) {
        new SimpleWindowAWT();
    }
}