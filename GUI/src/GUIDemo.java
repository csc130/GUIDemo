import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUIDemo extends JFrame implements ActionListener{
	private JTextField text1;
	private JButton b1,b2,bPlus,bEqual;
	private JPanel panel1;
	private int x=0,y=0,sum=0;
	public GUIDemo() {
		panel1 = new JPanel();
		panel1.setBackground(Color.CYAN);
		text1 = new JTextField("Display");
		b1 = new JButton("1");
		b1.addActionListener(this);
		b2 = new JButton("2");
		b2.addActionListener(this);
		bPlus = new JButton("+");
		bPlus.addActionListener(this);
		bEqual = new JButton("C");
		bEqual.addActionListener(this);
		add(panel1);
		panel1.add(text1);
		panel1.add(b1);
		panel1.add(b2);
		panel1.add(bPlus);
		panel1.add(bEqual);
		setSize(new Dimension(1000,1000));
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getActionCommand().equals("1")) {
			x=1;
			text1.setText("1");
		} 
		
		if (e.getActionCommand().equals("2")) {
			y=2;
			text1.setText("2");
		} 
		
		if (e.getActionCommand().equals("+")) {
			sum = x+y;
			text1.setText(Integer.toString(sum));
		}
		if (e.getActionCommand().equals("C")) {
			text1.setText("");
		}
	}
}
