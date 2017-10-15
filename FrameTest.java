package 10th_Assignment;
import javax.swing.*;
import java.awt.*;

public class FrameTest extends JFrame{
	public FrameTest() {
		setSize(300,200);
		setTitle("MyFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(new FlowLayout());
		JButton button = new JButton("¹öÆ°");
		this.add(button);
	}
	public static void main(String[] args) {
		new FrameTest();
	}

}
