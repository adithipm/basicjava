package basicJava;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class OperationalPanel extends JPanel implements ActionListener {

	ResultPanel result;
	
	OperationalPanel(ResultPanel result) {
		this.result = result;
		
		super.setBackground(Color.CYAN);
		GridLayout g3 = new GridLayout(6, 1);
		super.setLayout(g3);
		
		JButton b4 = new JButton("Clear");
		b4.setBackground(Color.GRAY);
		Font font = new Font("Sans", Font.BOLD, 30);
		b4.setFont(font);
		super.add(b4);
		b4.addActionListener(this);
		
		JButton b5 = new JButton("+");
		b5.setBackground(Color.YELLOW);
		font = new Font("Sans", Font.BOLD, 40);
		b5.setFont(font);
		super.add(b5);
		b5.addActionListener(this);
		
		JButton b6 = new JButton("-");
		b6.setBackground(Color.YELLOW);
		font = new Font("Sans", Font.BOLD, 40);
		b6.setFont(font);
		super.add(b6);
		b6.addActionListener(this);
		
		JButton b7 = new JButton("×");
		b7.setBackground(Color.YELLOW);
		font = new Font("Sans", Font.BOLD, 40);
		b7.setFont(font);
		super.add(b7);
		b7.addActionListener(this);
		
		JButton b8 = new JButton("÷");
		b8.setBackground(Color.YELLOW);
		font = new Font("Sans", Font.BOLD, 40);
		b8.setFont(font);
		super.add(b8);
		b8.addActionListener(this);
		
		JButton b9 = new JButton("=");
		b9.setBackground(Color.YELLOW);
		font = new Font("Sans", Font.BOLD, 40);
		b9.setFont(font);
		super.add(b9);
		b9.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent E) {
		// TODO Auto-generated method stub
		String value = E.getActionCommand();
		// JOptionPane.showMessageDialog(null, "Clicked " + value);
		result.setOperation(value);
	}

}
