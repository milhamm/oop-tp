package dev.aang.TP.TP10;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Driver {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Module PT 10");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("Include your criticism and suggestions");
        JLabel label1 = new JLabel("Criticism/suggestions are empty");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label1.setAlignmentX(Component.CENTER_ALIGNMENT);

        EmptyBorder border = new EmptyBorder(10, 10, 10, 10);
        panel.setBorder(new CompoundBorder(panel.getBorder(), border));
        panel2.setBorder(new CompoundBorder(panel2.getBorder(), border));
        panel2.setVisible(false);

        JTextArea textArea = new JTextArea(4, 20);
        textArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        textArea.setLineWrap(true);

        panel.add(label);
        panel.add(textArea);
        panel.setSize(285, 200);
        panel2.add(label1);

        JButton button = new JButton("Send");
        JButton buttonOk = new JButton("Ok");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonOk.setAlignmentX(Component.CENTER_ALIGNMENT);

        button.addActionListener(e -> {
            panel2.setVisible(true);
            panel.setVisible(false);
            if (!"".equals(textArea.getText())) {
                label1.setText("Thank you for your criticism and advice");
            }
        });

        buttonOk.addActionListener(e -> {
            panel.setVisible(true);
            panel2.setVisible(false);
            textArea.setText("");
            label1.setText("Criticism/suggestions are empty");
        });

        panel.add(button);
        panel2.add(buttonOk);

        frame.add(panel);
        frame.add(panel2);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
