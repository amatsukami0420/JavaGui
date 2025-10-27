package Labels;

import Frames.MyFrame;

import javax.swing.*;
import java.awt.*;

public class Label {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JLabel label = new JLabel("Bro Do you even code");
            label.setIcon(new ImageIcon("C:\\Users\\hp\\OneDrive\\Documents\\Assets\\COMSATS.png"));
            label.setHorizontalTextPosition(SwingConstants.CENTER);
            label.setVerticalTextPosition(SwingConstants.BOTTOM);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            label.setIconTextGap(10);
            label.setFont(new Font("SansSerif", Font.BOLD, 16));

            MyFrame frame = new MyFrame();
            frame.add(label);
        });
    }
}
