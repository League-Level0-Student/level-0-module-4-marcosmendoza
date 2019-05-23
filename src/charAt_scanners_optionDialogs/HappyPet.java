package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static dint happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
	// 3. Use showOptionDialog to ask the user what they want to do to make their
	// pet happy

	// (Beg: cuddle, food, water, take a walk, groom, clean up
	// pooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooop).
	// Make sure to customize the title and question too.
	// 1. Ask the user what kind of pet they want to buy, and store their answer in
	// a variable
	// 5. Use user input to call the appropriate method created in step 4.

	// 6. If you determine the happiness level is large enough, tell the
	// user that he loves his pet and use break; to exit for loop.
	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.

	static int happinessLevel = 0;

	public static void main(String[] args) {

		String pet = JOptionPane.showInputDialog("what pet do you want to buy?");

while(happinessLevel<20) {
	

		int action = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy??", "Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "feed", "walk", "sleep" }, null);

		System.out.println(action);
		if (action == 0) {
			Feed();
			JOptionPane.showMessageDialog(null, happinessLevel);
		}

		if (action == 1) {
		Walk();
		JOptionPane.showMessageDialog(null, happinessLevel);
	}
		if (action == 2) {
			Sleep();
			JOptionPane.showMessageDialog(null, happinessLevel);
	}
}
}

	public static void Feed() {
		JOptionPane.showMessageDialog(null, "feed it");
		happinessLevel += 5;
	}

	public static void Walk() {
		JOptionPane.showMessageDialog(null, "walk it");
		happinessLevel += 5;
	}
	
	public static void Sleep() {
		JOptionPane.showMessageDialog(null, "sleep it");
		happinessLevel += 5;
	}
	
}
