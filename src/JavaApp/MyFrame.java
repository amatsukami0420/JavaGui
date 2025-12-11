package JavaApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyFrame extends JFrame implements ActionListener {
    JLabel lbMain, lbUsername, lbPassword;
    JTextField tfUsername;
    JPasswordField tfPassword;
    JButton btnLogin, btnClear;
    Font fn;
    Font fnSl;
    public void addComponents() {
        fn = new Font("Montserrat", Font.BOLD, 24);
        fnSl = new Font("Montserrat", Font.BOLD, 14);
        lbMain=new JLabel();
        lbMain.setText("Login");
        lbMain.setFont(fn);
        lbMain.setForeground(Color.WHITE);
        lbMain.setOpaque(true);
        lbMain.setBackground(Color.BLACK);
        lbMain.setBounds(150,80, 120, 40);
        this.add(lbMain);
        lbUsername=new JLabel();
        lbUsername.setText("User Name");
        lbUsername.setBounds(40,160,120,40);
        lbUsername.setFont(fnSl);
        this.add(lbUsername);

        tfUsername=new JTextField();
        tfUsername.setBounds(180,160,160,40);
        this.add(tfUsername);


        lbPassword=new JLabel();
        lbPassword.setText("Password");
        lbPassword.setBounds(40,240,120,40);
        lbPassword.setFont(fnSl);
        this.add(lbPassword);

        tfPassword=new JPasswordField();
        tfPassword.setBounds(180,240,160,40);
        this.add(tfPassword);

        //MyEventHandler eventH=new MyEventHandler();
        btnLogin=new JButton();
        btnLogin.setText("Sign In");
        btnLogin.setBounds(60,320,120,40);
        btnLogin.addActionListener(this);
        this.add(btnLogin);
        btnClear=new JButton();
        btnClear.setText("Clear");
        btnClear.setBounds(220,320,120,40);
        btnClear.addActionListener(this);
        this.add(btnClear);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String str=e.getActionCommand();
        Random rd=new Random();
        if(str.compareTo("Sign In")==0)
        {
            int r=rd.nextInt(256);
            int g=rd.nextInt(256);
            int b=rd.nextInt(256);
            Color c=new Color(r,g,b);
            this.getContentPane().setBackground(c);
        }
        else
        if(str.compareTo("Clear")==0)
        {
            this.tfPassword.setText("");
            this.tfUsername.setText("");
            JOptionPane.showMessageDialog(null, "Clear Clicked");
        }
    }

}
