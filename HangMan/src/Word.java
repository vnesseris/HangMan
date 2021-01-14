import java.util.Random;

public class Word {

	// A small dictionary
	public String getWord(int index) {
		switch (index) {
		case 0: return "UNIVERSITY";
		case 1: return "COMPUTER";
		case 2: return "LAPTOP";
		case 3: return "HEADPHONES";
		case 4: return "FUZZY";
		case 5: return "HOTEL";
		case 6: return "KEYHOLE";
		case 7: return "TELEPHONE";
		case 8: return "PRINTER";
		case 9: return "BUILDING";
		default: return "Illegal index";
		}
		};
	
	//Random Choice Of a Word
	public int getRandom() {
		Random rnd = new Random();
		int chosen = rnd.nextInt(10);
		return chosen;
	}
	
	
}
