package jProjectEuler;

import oneHundred.OneToTen;

public class Main {

	public static void main(String[] args) {
		OneToTen firstTen = new OneToTen();
		
		long one = firstTen.problem001(1_000);
		int dos = firstTen.problem002(4_000_000);
		
		System.out.println("Problema 001: " + one);
		System.out.println("Problema 002: " + dos);
	}

}
