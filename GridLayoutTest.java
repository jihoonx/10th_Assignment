package 10th_Assignment;
import java.awt.*;
import javax.swing.*;


public class GridLayoutTest extends JFrame{
	public GridLayoutTest() {
		setTitle("GridLayoutTest");
		setLayout(new GridLayout(0,3));
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("Long Button5"));
		
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new GridLayoutTest();
	}

}
