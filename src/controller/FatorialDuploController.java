package controller;

public class FatorialDuploController {
	public FatorialDuploController() {
		super();
	}
	
	public int fatorialDuplo(int n) {
		if (n%2 == 0 && n != 0) {
			return 1 * fatorialDuplo(n-1);
		} else if (n > 0) {
			return n * fatorialDuplo(n-1);
		} else {return 1;}
	}
	
}
