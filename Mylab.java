package 10th_Assignment;
import java.awt.*;
import javax.swing.*;
public class Mylab extends JFrame{
	public Mylab() {
		setTitle("¿Âµµº¯È¯±â");
		setSize(300,200);
		JPanel panel1, panel2, panelall;
		JLabel label1, label2;
		JTextField field1, field2;
		JButton button;
		panelall = new JPanel();
		
		panel1 = new JPanel(new FlowLayout());
		label1 = new JLabel("È­¾¾ ¿Âµµ");
		field1 = new JTextField(15);
		panel1.add(label1);
		panel1.add(field1);
		panelall.add(panel1);
		
		panel2 = new JPanel(new FlowLayout());
		label2 = new JLabel("¼·¾¾ ¿Âµµ");
		field2 = new JTextField(15);
		panel2.add(label2);
		panel2.add(field2);
		panelall.add(panel2);
		
		button = new JButton("º¯È¯");
		panelall.add(button);
		add(panelall);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Mylab();
	}

}
