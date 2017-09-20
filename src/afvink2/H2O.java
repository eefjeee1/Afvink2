package afvink2;



import javax.swing.*; 
import java.awt.*;  
import java.awt.event.*;





public class H2O extends JFrame implements ActionListener{
    private JTextField textfieldx;
    private JTextField textfieldy; 
    private JButton button; 
    private JPanel panel; 
    
    public static void main(String[] args){
        H2O frame = new H2O(); 
        frame.setSize(500,500);
        frame.Afvink2();
        frame.setVisible(true); 
        
    }
    
    private void Afvink2(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        textfieldx = new JTextField("x-as");
        textfieldy = new JTextField("y-as"); 
        window.add(textfieldx);
        window.add(textfieldy);
        textfieldx.addActionListener(this);
        textfieldy.addActionListener(this);
      
        
        button = new JButton("Maak het watermolecuul"); 
        window.add(button);
        button.addActionListener(this);
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,500)); 
        window.add(panel);     
        
        textfieldx.addActionListener(this);
        textfieldy.addActionListener(this);
    }
    
    @Override
    public void actionPerformed (ActionEvent e){
        
        int x= Integer.parseInt(textfieldx.getText());
        int y= Integer.parseInt(textfieldy.getText());
        
        button.setBackground(Color.PINK); 
        panel.setBackground(Color.CYAN);
        Graphics paper = panel.getGraphics();
        
        paper.clearRect(0, 0, 500, 500); 
        
        paper.setColor(Color.BLACK);
        paper.drawLine(70+x, 65+y, 120+x, 110+y);
        paper.drawLine(70+x, 170+y, 120+x, 110+y);
        paper.setColor(Color.BLUE);
        paper.fillOval(50+x, 50+y, 35, 35);
        paper.fillOval(50+x, 150+y, 35, 35);
        paper.setColor(Color.RED);
        paper.fillOval(100+x, 95+y, 50, 50);
        
        
    
    }
}
