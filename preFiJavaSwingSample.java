/*car*/
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class car extends JPanel{
    public static void main (String[] args) {
        car t=new car();
        JFrame jf=new JFrame();
        jf.setTitle("car");
        jf.setSize(600,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(t);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.cyan);
        g.fillRect(120, 130, 300, 100);
        g.setColor(Color.cyan);
        g.fillRect(200, 30, 150, 100);
        g.setColor(Color.white);
        g.fillRect(230, 40, 90, 75);
        /*tires1*/
        g.setColor(Color.black);
        g.fillOval(320,170,100,100);
        g.setColor(Color.white);
        g.fillOval(350,200,40,40);
        /*tires2*/
        g.setColor(Color.black);
        g.fillOval(120,170,100,100);
        g.setColor(Color.white);
        g.fillOval(150,200,40,40);
    }
}


/*flowers*/
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class flower extends JPanel {
    public static void main(String[] args) {
        flower t=new flower();
        JFrame jf=new JFrame();
        jf.setTitle("flower");
        jf.setSize(600,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(t);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillOval(325,125,180,50);
        g.setColor(Color.pink);
        g.fillOval(105,125,180,50);
        g.setColor(new Color(255,140,0));
        g.fillOval(280,170,50,170);
        g.setColor(Color.yellow);
        g.fillOval(280,-35,50,170);
        g.setColor(Color.white);
        g.fillOval(280,125,55,55);
}
}

/*halfCircles*/
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class halfCircles extends JPanel {
    public static void main(String[] args) {
        halfCircles t=new halfCircles();
        JFrame jf=new JFrame();
        jf.setTitle("halfCircles");
        jf.setSize(600,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(t);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        g.fillArc(0, 0, 120, 180, 360,180);
        g.setColor(Color.MAGENTA);
        g.fillArc(118, 0, 120, 180, -180,180);
        g.setColor(Color.MAGENTA);
        g.fillArc(236, 0, 120, 180, 360,180);
        g.setColor(Color.MAGENTA);
        g.fillArc(354, 0, 120, 180, -180,180);
    }
}

/*pacman*/
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class pacman extends JPanel {
    public static void main(String[] args) {
        pacman t=new pacman();
        JFrame jf=new JFrame();
        jf.setTitle("pacman");
        jf.setSize(600,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(t);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GRAY);
        g.fillArc(0,0,150,150,30,300);
    }
}

/*tires*/
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class tires extends JPanel{
    public static void main(String[] args) {
        tires t=new tires();
        JFrame jf=new JFrame();
        jf.setTitle("tires");
        jf.setSize(600,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(t);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillOval(250,100,150,150);
        g.setColor(Color.white);
        g.fillOval(280,125,90,90);
}
}