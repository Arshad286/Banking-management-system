import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class login extends JFrame implements ActionListener{
        JButton login, clear , sign;
        JTextField cardField;
        JPasswordField pinField;
    login(){
        setSize(800,500);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setLocation(350,200);

        setTitle("SBI Banking system");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/sbi.jpg"));
        Image i2 = i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel label = new JLabel(i3);
        label.setBounds(10,15, 150,150);
        setLayout(null);
        add(label);

        JLabel text = new JLabel("Welcome to SBI ATM");
        text.setBounds(200,40, 400, 80);
        text.setFont(new Font("Oswald", Font.BOLD, 38) );
        add(text);

        JLabel cardno = new JLabel("Card no");
        cardno.setBounds(200,150, 400, 80);
        cardno.setFont(new Font("Raleway", Font.BOLD, 28) );
        add(cardno);

         cardField = new JTextField();
        cardField.setBounds(350,150,300,50);
        add(cardField);

        JLabel pin = new JLabel("PIN");
        pin.setBounds(200,230, 400, 80);
        pin.setFont(new Font("Raleway", Font.BOLD, 28) );
        add(pin);

         pinField = new JPasswordField();
        pinField.setBounds(350,230,300,50);
        add(pinField);

         login = new JButton("SIGN IN");
        login.setBounds(200,330,100,30); 
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

         clear = new JButton("CLEAR ");
        clear.setBounds(350,330,100,30); 
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

         sign = new JButton("SIGN UP");
        sign.setBounds(280,380,100,30); 
        sign.setBackground(Color.BLACK);
        sign.setForeground(Color.WHITE);
        sign.addActionListener(this);
        add(sign);


    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == login){

        }else if( ae.getSource() == sign){

        }else if( ae.getSource() == clear){
            cardField.setText("");
            pinField.setText(""); 
        }

    }
    public static void main(String[] args) {
        
        new login();
    }
}