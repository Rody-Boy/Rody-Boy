package myclient;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;


public class chatBox2 extends JFrame implements ActionListener{
        JButton jb1;
        JTextArea jt1;
        JTextField jt2;
        static Socket s;
        static DataInputStream din;
        static DataOutputStream dout;
        
    public chatBox2() {
        jt1 = new JTextArea();
        jt1.setEditable(false);
        jt1.setBounds(90, 50, 450, 150);
        add(jt1);

        jt2 = new JTextField();
        jt2.setBounds(90, 220, 150, 30);
        add(jt2);


        jb1 = new JButton("Send");
        jb1.setBounds(90, 250, 100, 30);
        add(jb1);

        jb1.addActionListener(this);

        setLayout(null);
        setSize(600,400);
        setVisible(true);
        
        try {
            String msg = "";
            
            s = new Socket("localhost",1111);
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            jt1.setText("Meeting has started.\n");
            
            while (!msg.equals("stop")) {
                msg = din.readUTF();
                
                jt1.setText(jt1.getText() + "\n Server : " + msg);
            }

        } catch (Exception e) {
        }
    }
public void actionPerformed(ActionEvent r) {
    try{
        String message = "";
        message = jt2.getText();
        dout.writeUTF(message);
        jt2.setText("");
        }
        catch(Exception e)
        {
        }

}
    public static void main(String[] args) {
        chatBox2 cb=new chatBox2();
    }
}
