package 10th_Assignment;
import java.awt.*;
import javax.swing.*;
public class FlowLayoutTest extends JFrame{
	public FlowLayoutTest() {
		setTitle("FlowLayoutTest");
		JPanel panel = new JPanel(new FlowLayout());
		JButton button1 = new JButton("Button1");
		JButton button2 = new JButton("Button2");
		JButton button3 = new JButton("Button3");
		JButton button4 = new JButton("B4");
		JButton button5 = new JButton("Long Button5");
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		add(panel);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new FlowLayoutTest();
	}

}
