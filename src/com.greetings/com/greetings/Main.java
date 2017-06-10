package com.greetings;

import org.astro.World;

public class Main {
	public static void main(String[] args) {
		if (args.length >= 1) {
			if ("test1".equalsIgnoreCase(args[0])) {
				new Main().test1();
			} else if ("test2".equalsIgnoreCase(args[0])) {
				new Main().test2();
			} else {
				System.out.println("A wrong test name has been specified!");
			}
		} else {
			new Main().test1();
		}
	}
	
	void test1() {
		System.out.format("Greetings %s!%n", World.name());
	}
	
	void test2() {
		try {
			test1();
		} catch (Error e) {
			System.out.println("An error occurred but ignored without further information!");
		}
	}
}
