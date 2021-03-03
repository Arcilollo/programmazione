package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

	private Account account;
	private JFrame frame;
	private JPanel panel;
	private JLabel money;

	private JFrame frameAdd;
	private JFrame frameRemove;
	private JPanel panelAdd;
	private JPanel panelRemove;

	JTextField moneyToAdd;
	JTextField moneyToRemove;

	public GUI() {
		frame = new JFrame();

		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));

		account = new Account(177013);
		money = new JLabel("Soldi sul conto: " + account.getMoney());
		JButton addMoneyBtn = new JButton("Deposita");
		addMoneyBtn.addActionListener(this::addMoney);
		JButton removeMoneyBtn = new JButton("Preleva");
		removeMoneyBtn.addActionListener(this::removeMoney);

		panel.add(money);
		panel.add(addMoneyBtn);
		panel.add(removeMoneyBtn);

		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Bank account");
		frame.pack();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent actionEvent) {}

	public void addMoney(ActionEvent actionEvent) {
		frameAdd = new JFrame();

		panelAdd = new JPanel();
		panelAdd.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panelAdd.setLayout(new GridLayout(0, 1));

		JLabel toDeposit = new JLabel("Soldi da depositare:");
		moneyToAdd = new JTextField();
		JButton addMoneyBtn2 = new JButton("Deposita");
		addMoneyBtn2.addActionListener(this::addMoneyToAccount);
		panelAdd.add(toDeposit);
		panelAdd.add(moneyToAdd);
		panelAdd.add(addMoneyBtn2);

		frameAdd.add(panelAdd, BorderLayout.CENTER);
		frameAdd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameAdd.setTitle("Bank account");
		frameAdd.pack();
		frameAdd.setVisible(true);

	}

	public void removeMoney(ActionEvent actionEvent) {
		frameRemove = new JFrame();

		panelRemove = new JPanel();
		panelRemove.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panelRemove.setLayout(new GridLayout(0, 1));

		JLabel toRemove = new JLabel("Soldi da prelevare:");
		moneyToRemove = new JTextField();
		JButton removeMoneyBtn2 = new JButton("Preleva");
		removeMoneyBtn2.addActionListener(this::removeMoneyToAccount);
		panelRemove.add(toRemove);
		panelRemove.add(moneyToRemove);
		panelRemove.add(removeMoneyBtn2);

		frameRemove.add(panelRemove, BorderLayout.CENTER);
		frameRemove.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameRemove.setTitle("Bank account");
		frameRemove.pack();
		frameRemove.setVisible(true);
	}

	public void addMoneyToAccount(ActionEvent actionEvent) {
		account.addMoney(Float.parseFloat(moneyToAdd.getText()));
		money.setText("Soldi sul conto: " + account.getMoney());
		frameAdd.dispose();
		frameAdd = null;
	}

	public void removeMoneyToAccount(ActionEvent actionEvent) {
		account.removeMoney(Float.parseFloat(moneyToRemove.getText()));
		money.setText("Soldi sul conto: " + account.getMoney());
		frameRemove.dispose();
		frameRemove = null;
	}
}
