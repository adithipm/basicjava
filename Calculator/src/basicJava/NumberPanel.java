package basicJava;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class NumberPanel extends JPanel implements ActionListener {

	ResultPanel result;

	NumberPanel(ResultPanel result) {
		this.result = result;

		super.setBackground(Color.CYAN);
		GridLayout g2 = new GridLayout(4, 3);
		super.setLayout(g2);

		for (int x = 0; x < 10; x = x + 1) {
			JButton b1 = new JButton(Integer.toString(x));
			b1.setBackground(Color.MAGENTA);
			Font font = new Font("Sans", Font.BOLD, 40);
			b1.setFont(font);
			super.add(b1);
			b1.addActionListener(this);
		}

		JButton b2 = new JButton(".");
		b2.setBackground(Color.MAGENTA);
		Font font = new Font("Sans", Font.BOLD, 40);
		b2.setFont(font);
		super.add(b2);
		b2.addActionListener(this);

		JButton b3 = new JButton("(+/-)");
		b3.setBackground(Color.MAGENTA);
		font = new Font("Sans", Font.BOLD, 30);
		b3.setFont(font);
		super.add(b3);
		b3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent E) {
		// TODO Auto-generated method stub
		String value = E.getActionCommand();
		// JOptionPane.showMessageDialog(null, "Clicked " + value);
		result.setNumber(value);
	}

}
