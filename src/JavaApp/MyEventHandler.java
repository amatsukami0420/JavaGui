package JavaApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyEventHandler implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String str=e.getActionCommand();

        if(str.compareTo("Login")==0)
        {
            JOptionPane.showMessageDialog(null, "Sign In Clicked");
        }
        else
        if(str.compareTo("Clear")==0)
        {
            JOptionPane.showMessageDialog(null, "Clear Clicked");
        }
    }
}
