package 10th_Assignment;
import java.awt.*;
import javax.swing.*;

public class MyFrame4 extends JFrame {
	JPanel p = new JPanel();
	JLabel[] labels = new JLabel[30];

	public MyFrame4() {
		p.setLayout(null);
		p.setBackground(Color.YELLOW);
		for (int i = 0; i < 30; i++) {
			labels[i] = new JLabel("" + i);
			int x = (int) (500 * Math.random());
			int y = (int) (200 * Math.random());
			labels[i].setForeground(Color.MAGENTA);
			labels[i].setLocation(x, y);
			labels[i].setSize(20, 20);
			p.add(labels[i]);
		}
		setSize(500, 300);
		add(p);
		setVisible(true); // �������� ȭ�鿡 ǥ���Ѵ�.
	}
	public static void main(String args[]) {
		new MyFrame4();
	}

}


