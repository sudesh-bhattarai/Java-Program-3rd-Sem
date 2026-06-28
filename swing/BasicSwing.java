package Swing;
import javax.swing.*;
public class BasicSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Swing App");

        JLabel label = new JLabel("Hello, Welcome to Java Swing!");
        label.setBounds(50, 30, 250, 30);

        JButton button = new JButton("Click Me");
        button.setBounds(90, 80, 120, 30);

        frame.add(label);
        frame.add(button);

        frame.setSize(300, 200);
        frame.setLayout(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
