//Java code to create a frame and add a button to it:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("My Button Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JButton button = new JButton("Click me!");

        // add ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked");
            }
        });

        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setVisible(true);
    }
}
