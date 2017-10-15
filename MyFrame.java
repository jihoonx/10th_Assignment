package 10th_Assignment;
import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame{
	public MyFrame(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(300,200);
		setLocation(screenSize.width/2, screenSize.height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("MyFrame");
		Image img = kit.getImage("car.gif");
		setIconImage(img);
		setLayout(new FlowLayout());
		JButton button = new JButton("¹öÆ°");
		this.add(button);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();

	}

}
