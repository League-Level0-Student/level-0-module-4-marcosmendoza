package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
int n =	Integer.parseInt(JOptionPane.showInputDialog("how much nickels do you have??????"));

int d =	Integer.parseInt(JOptionPane.showInputDialog("how much dimes do you have??????"));

int q =	Integer.parseInt(JOptionPane.showInputDialog("how much quarters do you have??????"));
		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable 

double Total = 0.0;
	Total+=n*.05;
	Total+=d*.10;
	Total+=q*.25;
		// Tell the user how much money they have
	JOptionPane.showMessageDialog(null, "you have $" +Total);

	}
}

