package pl.piomin.service.proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReadDoubleValues {

	public static void main(String[] args) {

		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Enter Double Values: ");
			String line = bufferReader.readLine();
			StringTokenizer stringTokenizer = new StringTokenizer(line);
			double d1 = Double.parseDouble(stringTokenizer.nextToken(","));
			double d2 = Double.parseDouble(stringTokenizer.nextToken(","));
			double d3 = Double.parseDouble(stringTokenizer.nextToken(","));
			System.out.println(largest(d1, d2, d3));

		} catch (IOException e) {

			e.printStackTrace();

		}
	}
	
	public static double largest(double d1, double d2, double d3) {
		double temp = Math.max(d3,d2);
		double d4 = Math.max(d1, temp);
		return d4;
		
	}
	
}
