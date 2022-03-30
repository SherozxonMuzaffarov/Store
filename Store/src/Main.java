import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Main extends JFrame {

	JMenuBar menuBar = new JMenuBar();

	JMenu food = new JMenu("Food");
	JMenuItem burger = new JMenuItem("Burger");
	JMenuItem hot_dog = new JMenuItem("Hot-dog");
	JMenuItem lavash = new JMenuItem("Lavash");
	JMenuItem sandwich = new JMenuItem("Sandwich");

	JMenu drink = new JMenu("Drink");
	JMenuItem coca_cola = new JMenuItem("Coca-cola");
	JMenuItem pepsi = new JMenuItem("Pepsi");
	JMenuItem fanta = new JMenuItem("Fanta");
	JMenuItem water = new JMenuItem("Water");

	JMenu snack = new JMenu("Snack");
	JMenuItem chocolate = new JMenuItem("Chocolate");
	JMenuItem chips = new JMenuItem("Chips");
	JMenuItem sweets = new JMenuItem("sweets");
	JMenuItem pankie = new JMenuItem("Pankie");

	JLabel food_choice = new JLabel("Selected Food: ");
	JLabel drink_choice = new JLabel("Selected Drink: ");
	JLabel snack_choice = new JLabel("Selected Snack: ");
	JPanel btnPanel = new JPanel();
	JButton submitBtn = new JButton("Submit");
	JButton cancelBtn = new JButton("Cancel");
	Integer num, price, total = 0;
	String name;

	public Main() {
		this.setSize(340, 340);
		this.setTitle("Store");
		this.setLayout(new GridLayout(4, 3));
		this.setJMenuBar(menuBar);

		menuBar.add(food);
		menuBar.add(drink);
		menuBar.add(snack);

		food.add(burger);
		food.add(hot_dog);
		food.add(lavash);
		food.add(sandwich);

		drink.add(coca_cola);
		drink.add(pepsi);
		drink.add(fanta);
		drink.add(water);

		snack.add(chocolate);
		snack.add(chips);
		snack.add(sweets);
		snack.add(pankie);

		// food
		burger.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				num = Integer.valueOf(JOptionPane.showInputDialog("How Many Are Being Purchased"));
				price = 18000;
				total += num * price;

				String name = burger.getActionCommand();
				name += "-" + num;
				food_choice.setText(food_choice.getText() + name + ", ");
			}
		});
		hot_dog.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				num = Integer.valueOf(JOptionPane.showInputDialog("How Many Are Being Purchased"));
				price = 11000;
				total += num * price;

				String name = hot_dog.getActionCommand();
				name += "-" + num;
				food_choice.setText(food_choice.getText() + name + ", ");
			}
		});
		lavash.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				num = Integer.valueOf(JOptionPane.showInputDialog("How Many Are Being Purchased"));
				price = 22000;
				total += num * price;

				String name = lavash.getActionCommand();
				name += "-" + num;
				food_choice.setText(food_choice.getText() + name + ", ");
			}
		});
		sandwich.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				num = Integer.valueOf(JOptionPane.showInputDialog("How Many Are Being Purchased"));
				price = 13000;
				total += num * price;

				String name = sandwich.getActionCommand();
				name += "-" + num;
				food_choice.setText(food_choice.getText() + name + ", ");
			}
		});

		// drink
		coca_cola.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				num = Integer.valueOf(JOptionPane.showInputDialog("How Many Are Being Purchased"));
				price = 10000;
				total += num * price;

				String name = coca_cola.getActionCommand();
				name += "-" + num;
				drink_choice.setText(drink_choice.getText() + name + ", ");
			}
		});
		pepsi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				num = Integer.valueOf(JOptionPane.showInputDialog("How Many Are Being Purchased"));
				price = 12000;
				total += num * price;

				String name = pepsi.getActionCommand();
				name += "-" + num;
				drink_choice.setText(drink_choice.getText() + name + ", ");
			}
		});
		fanta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				num = Integer.valueOf(JOptionPane.showInputDialog("How Many Are Being Purchased"));
				price = 9000;
				total += num * price;

				String name = fanta.getActionCommand();
				name += "-" + num;
				drink_choice.setText(drink_choice.getText() + name + ", ");
			}
		});
		water.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				num = Integer.valueOf(JOptionPane.showInputDialog("How Many Are Being Purchased"));
				price = 2000;
				total += num * price;

				String name = water.getActionCommand();
				name += "-" + num;
				drink_choice.setText(drink_choice.getText() + name + ", ");
			}
		});

		// Snack
		chocolate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				num = Integer.valueOf(JOptionPane.showInputDialog("How Many Are Being Purchased"));
				price = 16000;
				total += num * price;

				String name = chocolate.getActionCommand();
				name += "-" + num;
				snack_choice.setText(snack_choice.getText() + name + ", ");
			}
		});
		chips.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				num = Integer.valueOf(JOptionPane.showInputDialog("How Many Are Being Purchased"));
				price = 7000;
				total += num * price;

				String name = chips.getActionCommand();
				name += "-" + num;
				snack_choice.setText(snack_choice.getText() + name + ", ");
			}
		});
		sweets.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				num = Integer.valueOf(JOptionPane.showInputDialog("How Many Are Being Purchased"));
				price = 10000;
				total += num * price;

				String name = sweets.getActionCommand();
				name += "-" + num;
				snack_choice.setText(snack_choice.getText() + name + ", ");
			}
		});
		pankie.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				num = Integer.valueOf(JOptionPane.showInputDialog("How Many Are Being Purchased"));
				price = 4000;
				total += num * price;

				String name = pankie.getActionCommand();
				name += "-" + num;
				snack_choice.setText(snack_choice.getText() + name + ", ");
			}
		});

		submitBtn.setFocusable(false);
		submitBtn.setFont(new Font("Verdana", Font.BOLD, 15));
		submitBtn.setForeground(Color.white);
		submitBtn.setBackground(Color.green);
		submitBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int res = JOptionPane.showConfirmDialog(null, "your total payment:" + total, null,
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

					food_choice.setText("Selected Food: " );
					drink_choice.setText("Selected Drink: ");
					snack_choice.setText("Selected Snack: ");
			}
		});

		cancelBtn.setFocusable(false);
		cancelBtn.setFont(new Font("Verdana", Font.BOLD, 15));
		cancelBtn.setForeground(Color.white);
		cancelBtn.setBackground(Color.red);
		cancelBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				food_choice.setText("Selected Food: ");
				drink_choice.setText("Selected Drink: ");
				snack_choice.setText("Selected Snack: ");

			}
		});

		btnPanel.add(submitBtn);
		btnPanel.add(cancelBtn);

		this.add(btnPanel, BorderLayout.NORTH);

		this.add(food_choice);
		this.add(drink_choice);
		this.add(snack_choice);

		this.setVisible(true);
	}

	public static void main(String[] args) {

		new Main();

	}

}
