package Frames;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        this.setTitle("My Frame");
        this.setSize(420,420);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        ImageIcon icon = new ImageIcon("C:\\Users\\hp\\OneDrive\\Documents\\Assets\\COMSATS.png");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(245, 189, 2));
    }
}
