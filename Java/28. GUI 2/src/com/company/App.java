package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
	public JPanel panel1;
	private JTextField num1;
	private JButton calcolaButton;
	private JTextField num2;
	private JLabel result;

	public App() {
		calcolaButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				double n1 = Double.parseDouble(num1.getText());
				double n2 = Double.parseDouble(num2.getText());

				result.setText("Risultato: " + (n1 + n2));

			}
		});
	}

	public static void main(String[] args) {
		JFrame f = new JFrame("Calcolatrice");
		f.setContentPane(new App().panel1);
		f.setSize(200, 150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
	}
}
