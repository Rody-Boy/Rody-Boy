public class MyDemo1 {
    public static void main(String args[]){
        JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
        
        JButton button = new JButton("My Demo");
        button.setBounds(90, 100, 200, 100);
        frame.getContentPane().add(button);

    }
}
/*
public class MyDemo2{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Home");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("New Window");
        mb.add(menu);
        JMenuItem menuI = new JMenuItem("Create New Window");
        menu.add(menuI);

        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.setVisible(true);
  
      
          menuI.addActionListener((ActionEvent) -> {
            frame.setVisible(false);
            JFrame newFrame = new JFrame("New Window");
            newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            newFrame.setSize(300,300);
            newFrame.setVisible(true);
      });
      
   }
}

public class MyDemo3 {
    public static void main(String args[]){
        JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
        
        JButton button = new JButton("My Demo");
        button.setBounds(90, 100, 200, 100);
        frame.getContentPane().add(button);
        
        button.addActionListener((ActionEvent) -> {
            JOptionPane.showMessageDialog(null,"I LOVE YOU","Message",JOptionPane.INFORMATION_MESSAGE);
            
    });
}
}*/