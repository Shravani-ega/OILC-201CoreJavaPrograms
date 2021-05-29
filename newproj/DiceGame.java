package newproj;

import java.util.Random;
import java.util.Scanner;

class Dice {

	int faceValue;
	Random r = new Random();

	void roll() {
		faceValue = r.nextInt(6) + 1;
	}
}

class Player {
	String name;
	int pValue;

	void accept(String name) {
		this.name = name;
	}

	void throwDice(Dice d1, Dice d2) {
		d1.roll();
		d2.roll();
		pValue = d1.faceValue + d2.faceValue;
		System.out.println(pValue + "=" + d1.faceValue + "+" + d2.faceValue);
	}
}

class DiceGame {

	public static void main(String[] args) {

		Dice d1 = new Dice();
		Dice d2 = new Dice();

		Player p1 = new Player();
		Player p2 = new Player();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Player name :");
		p1.accept(sc.next());

		System.out.println("Enter Second Player name :");
		p2.accept(sc.next());

		System.out.println("Player1 Score");
		p1.throwDice(d1, d2);
		System.out.println();

		System.out.println("Player2 Score");
		p2.throwDice(d1, d2);

		if (p1.pValue > p2.pValue) {
			System.out.println(p1.name + " Wins the game");

		} else if (p2.pValue > p1.pValue) {

			System.out.println(p2.name + " Wins the game");
		} else {

			System.out.println("Please Try Again ");
		}
	}
}
