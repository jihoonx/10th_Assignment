package 10th_Assignment;
import java.awt.*;
import javax.swing.*;
public class AbsolutePositionTest extends JFrame{
	public AbsolutePositionTest(){
		setSize(400,200);
		setTitle("AbsolutePositionTest");
		setLayout(null);
		JButton b1, b2, b3;
		
		b1 = new JButton("Button #1");
		add(b1);
		b1.setBounds(20,5,95,30);
		
		b2 = new JButton("Button #2");
		add(b2);
		b2.setBounds(55,45,105,70);
		
		b3 = new JButton("Button #3");
		add(b3);
		b3.setBounds(180,15,105,90);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new AbsolutePositionTest();
	}

}
