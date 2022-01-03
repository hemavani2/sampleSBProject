package pl.piomin.service.proxy;

public class AlphabetHalfPyramid {

	public void halfPyramid() {
		int rows = 5, i, j;
		int letter = 64;
		for (i = 1; i <= rows; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print((char) (j + letter) + " ");
			}
		}
	}
}