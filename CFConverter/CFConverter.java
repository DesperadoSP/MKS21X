import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CFConverter extends JFrame implements ActionListener{
 private Container pane;
 private JButton b, b2;
 private JLabel l;
 private JTextField t;

 
  //CONSTRUCTOR SETS EVERYTHING UP
  public CFConverter() {
     this.setTitle("My first GUI");
     this.setSize(600,400);
     this.setLocation(100,100);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
     pane = this.getContentPane();
     pane.setLayout(new FlowLayout());  //NOTE!! THIS CAN BE CHANGED (see below)
    
     b = new JButton("Celcius to Fahrenheit");
     b.addActionListener(this);
     b2 = new JButton("Fahrenheit to Celcius");
     b2.addActionListener(this);
     l = new JLabel("Celcius/Fahrenheit Converter",null,JLabel.CENTER);
     t = new JTextField(12);
     
     pane.add(l);
     pane.add(b);
     pane.add(t);
     pane.add(b2);
 }

    public void actionPerformed (ActionEvent e){
        
	if (e.getSource() == b){
	    try{
	    System.out.println(CtoF(Double.parseDouble(t.getText())));
	    }catch (NumberFormatException a){
		System.out.println("Please enter a valid number");
	    }
	}
	else {
	    if (e.getSource() == b2){
		try{
		System.out.println(FtoC(Double.parseDouble(t.getText())));
		}catch (NumberFormatException a){
		    System.out.println("Please enter a valid number");
		}
	}
	}
    }
    
	    




    

    public static double CtoF(double t){
	return ((t * 9) / 5) + 32.0;
    }

    public static double FtoC(double t){
	return ((t - 32) / 9) * 5;
    }

  //MAIN JUST INSTANTIATES + MAKE VISIBLE
  public static void main(String[] args) {
     CFConverter g = new CFConverter();
     g.setVisible(true);
  }
}
