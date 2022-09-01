import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GradeComputer extends JFrame implements ActionListener {

JButton jb1,jb2,jb3,jb4,jb5;
JTextField jt1, jt2,jt3,jt4,jt5,jt6,jt7,jt8;
JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9,lbl10,lbl11,lbl12;

GradeComputer() {
lbl6 = new JLabel("PT Grades");
lbl6.setBounds(0, 50, 100, 20);
add(lbl6);

lbl6 = new JLabel("Examination");
lbl6.setBounds(0, 80, 100, 30);
add(lbl6);
//prelim
lbl2 = new JLabel("Prelim");
lbl2.setBounds(90, 10, 50, 30);
add(lbl2);

jt1 = new JTextField();
jt1.setBounds(90, 50, 50, 30);
add(jt1);

jt2 = new JTextField();
jt2.setBounds(90, 80, 50, 30);
add(jt2);

//midterm
lbl3 = new JLabel("Midterm");
lbl3.setBounds(150, 10, 70, 30);
add(lbl3);

jt3 = new JTextField();
jt3.setBounds(150, 50, 50, 30);
add(jt3);

jt4 = new JTextField();
jt4.setBounds(150, 80, 50, 30);
add(jt4);

//prefinal
lbl4 = new JLabel("Prefinal");
lbl4.setBounds(210, 10, 80, 30);
add(lbl4);

jt5 = new JTextField();
jt5.setBounds(210, 50, 50, 30);
add(jt5);

jt6 = new JTextField();
jt6.setBounds(210, 80, 50, 30);
add(jt6);

//final
lbl5 = new JLabel("Final");
lbl5.setBounds(270, 10, 50, 30);
add(lbl5);

jt7 = new JTextField();
jt7.setBounds(270, 50, 50, 30);
add(jt7);

jt8 = new JTextField();
jt8.setBounds(270, 80, 50, 30);
add(jt8);

lbl8 = new JLabel("Grades");
lbl8.setBounds(90, 140, 150, 30);
add(lbl8);

lbl9 = new JLabel("Grades");
lbl9.setBounds(150, 140, 150, 30);
add(lbl9);

lbl10 = new JLabel("Grades");
lbl10.setBounds(210, 140, 150, 30);
add(lbl10);

lbl11 = new JLabel("Grades");
lbl11.setBounds(270, 140, 150, 30);
add(lbl11);

lbl12 = new JLabel("Numerical Interpretation");
lbl12.setBounds(270, 220, 180, 30);
add(lbl12);

lbl1 = new JLabel("Final Grades");
lbl1.setBounds(270, 200, 150, 30);
add(lbl1);


jb1 = new JButton("Calculate");
jb1.setBounds(90, 200, 100, 30);
add(jb1);


jb1.addActionListener(this);

setLayout(null);
setSize(600, 400);
setVisible(true);

}

public void actionPerformed(ActionEvent act) {

int a = Integer.parseInt(jt1.getText());
int b = Integer.parseInt(jt2.getText());
int c = Integer.parseInt(jt3.getText());
int d = Integer.parseInt(jt4.getText());
int e = Integer.parseInt(jt5.getText());
int f = Integer.parseInt(jt6.getText());
int g = Integer.parseInt(jt7.getText());
int h = Integer.parseInt(jt8.getText());
double prelim,midterm,prefinal,finals,finalGrades=0;

if (act.getSource().equals(jb1)) {
    prelim=(a*60/100+b*40/100);
    midterm=(c*60/100+d*40/100);
    prefinal=(e*60/100+f*40/100);
    finals=(g*60/100+h*40/100);
    finalGrades=(prelim*.2+midterm*.25+prefinal*.25+finals*.3);

    lbl8.setText(String.valueOf(prelim));
    lbl9.setText(String.valueOf(midterm));
    lbl10.setText(String.valueOf(prefinal));
    lbl11.setText(String.valueOf(finals));
    lbl1.setText(String.valueOf(finalGrades));
}
if (finalGrades==100) {
    lbl12.setText(String.valueOf("1.0"));
}
else if(finalGrades==99) {
    lbl12.setText(String.valueOf("1.1"));
}
else if(finalGrades==98) {
    lbl12.setText(String.valueOf("1.2"));
}
else if(finalGrades==97) {
    lbl12.setText(String.valueOf("1.3"));
}
else if(finalGrades==96) {
    lbl12.setText(String.valueOf("1.4"));
}
else if(finalGrades==95) {
    lbl12.setText(String.valueOf("1.5"));
}
else if(finalGrades==94) {
    lbl12.setText(String.valueOf("1.6"));
}
else if(finalGrades==93) {
    lbl12.setText(String.valueOf("1.7"));
}
else if(finalGrades==92) {
    lbl12.setText(String.valueOf("1.8"));
}
else if(finalGrades==91) {
    lbl12.setText(String.valueOf("1.9"));
}
else if(finalGrades==90) {
    lbl12.setText(String.valueOf("2.0"));
}
else if(finalGrades==89) {
    lbl12.setText(String.valueOf("2.1"));
}
else if(finalGrades==88) {
    lbl12.setText(String.valueOf("2.2"));
}
else if(finalGrades==87) {
    lbl12.setText(String.valueOf("2.3"));
}
else if(finalGrades==86) {
    lbl12.setText(String.valueOf("2.4"));
}
else if(finalGrades==85) {
    lbl12.setText(String.valueOf("2.5"));
}
else if(finalGrades==84) {
    lbl12.setText(String.valueOf("2.6"));
}
else if(finalGrades==83) {
    lbl12.setText(String.valueOf("2.7"));
}
else if(finalGrades==82) {
    lbl12.setText(String.valueOf("2.8"));
}
else if(finalGrades==81) {
    lbl12.setText(String.valueOf("2.9"));
}
else if(finalGrades==80) {
    lbl12.setText(String.valueOf("3.0"));
}
else if(finalGrades==79) {
    lbl12.setText(String.valueOf("3.1"));
}
else if(finalGrades==78) {
    lbl12.setText(String.valueOf("3.2"));
}
else if(finalGrades==77) {
    lbl12.setText(String.valueOf("3.3"));
}
else if(finalGrades==76) {
    lbl12.setText(String.valueOf("3.4"));
}
else if(finalGrades<=75) {
    lbl12.setText(String.valueOf("5.0"));
}
}

public static void main(String args[]) {
	GradeComputer gc= new GradeComputer();
	
}
}