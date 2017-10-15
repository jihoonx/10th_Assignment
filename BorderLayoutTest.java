package 10th_Assignment;
import java.awt.*;
import javax.swing.*;
public class BorderLayoutTest extends JFrame{
	public BorderLayoutTest() {
		setTitle("BorderLayoutTest");
		
		add(new JButton("NORTH"),BorderLayout.NORTH);
		add(new JButton("SOUTH"),BorderLayout.SOUTH);
		add(new JButton("CENTER"),BorderLayout.CENTER);
		add(new JButton("WEST"),BorderLayout.WEST);
		add(new JButton("EAST"),BorderLayout.EAST);

		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new BorderLayoutTest();
	}

}
