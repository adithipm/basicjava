package basicJava;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Making the frame
		JFrame f1 = new JFrame("Calculator : )");
		f1.setSize(650, 600);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closing the window

		// The layout for the frame
		GridLayout g1 = new GridLayout(2, 2);
		f1.setLayout(g1);
		
		JPanel dummyPanel = new JPanel();
		dummyPanel.setBackground(Color.CYAN);
		f1.add(dummyPanel);
		
		ResultPanel r1 = new ResultPanel();
		f1.add(r1);
		
		NumberPanel n1 = new NumberPanel(r1);
		f1.add(n1);

		OperationalPanel o1 = new OperationalPanel(r1);
		f1.add(o1);

		f1.setVisible(true);
	}

}
