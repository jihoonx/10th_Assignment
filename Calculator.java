package 10th_Assignment;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{
	String op = null;
	String firstOp = null;
	String x=null, y=null;
	String result=null;
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = { 
			"Backspace", "", "", "CE", "C",
			"7", "8", "9", "/", "sqrt",
			"4", "5", "6", "x", "%",
			"1", "2", "3", "-", "1/x",
			"0", "+/-", ".", "+", "="
	};
	public Calculator() {
		tField = new JTextField(35);
		panel = new JPanel();
		tField.setText("");
		
  
		panel.setLayout(new GridLayout(0, 5, 3, 3));
		buttons = new JButton[25];
		int index = 0;
		for (int rows = 0; rows < 5; rows++) {
			for (int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				buttons[index].addActionListener(this);
				if( cols >= 3 )
					buttons[index].setForeground(Color.red);
				else 
					buttons[index].setForeground(Color.blue);
				buttons[index].setBackground(Color.yellow);
				panel.add(buttons[index]);
				index++;
			}
		}
		add(tField, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack();
	}
	public void actionPerformed(ActionEvent e){
		String s = e.getActionCommand();
		String set = null;
		String f = tField.getText();
		char c = s.charAt(0);
		if('0' <= c && c <= '9' && s != "1/x" || s == "."){ //숫자라면
			tField.setText(tField.getText()+s);
		}
		else if(s == "Backspace"){
			tField.setText("");
			set = f.substring(0, f.length()-1); // 0~ 마지막-1까지
			tField.setText(set);
		}
		else if(s == "C" || s == "CE"){
			tField.setText("");
			x = null;
			y = null;
			op = null;
			firstOp = null;
		}
		else if(s == "+" || s == "-" || s == "*" || s == "/" || s == "%"){
			x = tField.getText();
			double nX = Double.parseDouble(x);
			if(firstOp != null){
				switch(firstOp){
				case "sqrt":
					x = ""+Math.sqrt(nX);
					break;
				case "1/x":
					x = ""+ 1/nX;
					break;
				}
				firstOp = null;
			}
			op = s; //op를 세팅시킴.
			tField.setText("");
		}
		else if(s == "sqrt" || s == "1/x"){
			System.out.println("firstOp = "+s);
			firstOp = s;
		}
		else if(s == "=" && op != null){ //=을 눌렀을때 op가 null이 아니면(x값, op값 있음.)
			y = tField.getText();
			double nX = Double.parseDouble(x);
			double nY = Double.parseDouble(y);
			if(firstOp != null){
				switch(firstOp){
				case "sqrt":
					y = ""+Math.sqrt(nY);
					break;
				case "1/x":
					y = ""+ 1/nY;
					break;
				}
				firstOp = null;
			}
			switch(op){
			case "+":
				result = ""+(nX+nY);
				break;
			case "-":
				result = ""+(nX-nY);
				break;
			case "*":
				result = ""+(nX*nY);
				break;
			case "/":
				result = ""+(nX/nY);
				break;
			case "%":
				result = ""+(nX%nY);
				break;
			}
			
			tField.setText(result);
			x = null;
			y = null;
			op = null;
			firstOp = null;
		}
	}
	public static void main(String args[]) {
		new Calculator();
	}
}

