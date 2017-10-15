package 10th_Assignment;
import java.awt.*;
import javax.swing.*;

public class MyFrame2 extends JFrame{
	public MyFrame2(){
		setSize(600,150);
		setTitle("자바 피자");
		JPanel panel, panelA, panelB;
		JLabel label1, label2;
		JButton button1, button2, button3;
		JTextField field = new JTextField(10);
		
		panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panelA = new JPanel();
		label1 = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		panelA.add(label1);
		panelA.setBackground(Color.YELLOW);
		panel.add(panelA);
		
		
		panelB = new JPanel(new FlowLayout());
		button1 = new JButton("콤보피자");
		button2 = new JButton("포테이토피자");
		button3 = new JButton("불고기피자");
		label2 = new JLabel("개수");
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		panelB.add(label2);
		panelB.add(field);
		panelB.setBackground(Color.GREEN);
		panel.add(panelB);
		
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
		new MyFrame2();
	}

}
