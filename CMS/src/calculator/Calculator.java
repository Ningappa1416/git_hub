package calculator;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class Calculator {
	
	Label l1= new Label("First Number");
	TextField t1= new TextField(10);
	Label l2= new Label("Second number");
	TextField t2= new TextField(10);
	Label l3= new Label("Result");
	TextField t3= new TextField(10);
	Button b1= new Button("add");
	
	public Calculator() {
		//creat panel
		Panel pan= new Panel();
		//set layout
		GridLayout layout = new GridLayout(4, 2);
		pan.setLayout(layout);
		//add content to the pannel 
		pan.add(l1);
		pan.add(t1);
		pan.add(l2);
		pan.add(t2);
		pan.add(l3);
		pan.add(t3);
		pan.add(b1);
		
		//Create frame and add panel to it 
		
		JFrame frame = new JFrame("Calculator");
		frame.setContentPane(pan);
		frame.setVisible(true);
		frame .setSize(700, 300);
		b1.addActionListener(new MyListenre());
		
	}
class MyListenre implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			double a=Integer.parseInt(t1.getText());
			double b=Integer.parseInt(t2.getText());
			double c= a+b;
			 String result=String.valueOf(c);
			 t3.setText(result);
		}
		
	}

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();	
	}

}
