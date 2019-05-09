import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
		String input =	JOptionPane.showInputDialog("what was your test score");
		double score=Double.parseDouble(input);
		
		
		if(score>90) {
			JOptionPane.showMessageDialog(null, "YOU DID GOT GOOD ANSWER TEST");
	}
		else if(score<	90) {
			JOptionPane.showMessageDialog(null, "you got BAD IDIoT");
}
}
}