package JavaApp;

import javax.swing.*;

public class JavaApplication64 {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setSize(400, 600);
        frame.setTitle("Portal");
        ImageIcon icon = new ImageIcon("C:\\Users\\hp\\OneDrive\\Documents\\Assets\\COMSATS.png");
        frame.setIconImage(icon.getImage());
        frame.addComponents();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        JLabel label = new JLabel("COMSATS UNIVERSITY");
        label.setIcon(new ImageIcon("C:\\Users\\hp\\OneDrive\\Documents\\Assets\\COMSATS.png"));
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.BOTTOM);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setIconTextGap(10);
        frame.add(label);
    }
}
