package jProjectEuler;

import jProjectEulerLib.Level001;

public class Main {

	public static void main(String[] args) {
		Level001 level001 = new Level001();
		System.out.println("Problema 001: " + level001.problem001(1_000));
		System.out.println("Problema 002: " + level001.problem002(4_000_000));
		System.out.println("Problema 003: " + level001.problem003(600_851_475_143L));
		System.out.println("Problema 004: " + level001.problem004(3));

	}

}
