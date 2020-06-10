import java.util.Scanner;

public class Coffee {

	static int water = 400;
	static int milk = 540;
	static int beans = 120;
	static int cups = 9;
	static int money = 550;

	public static void main(String[] args) {
		machine();
	}
	
	public static void machine() {
		Scanner scan1 = new Scanner(System.in);
		while(true) {
			System.out.println("Write action (buy,fill,take,remaining,exit): ");
			String response = scan1.nextLine();
			if (response.equals("buy")) {
				buy();
			}
			if (response.equals("fill")) {
				fill();
			}
			if (response.equals("take")) {
				take();
			}
			if(response.equals("remaining")) {
				status();
			}
			if (response.equals("exit")) {
				System.exit(0);
				break;
			}
		}
	}

	public static void status() {
		System.out.println("The coffee machine has: ");
		System.out.println(water + " of water");
		System.out.println(milk + " of milk");
		System.out.println(beans + " of coffee beans");
		System.out.println(cups + " of disposable cups");
		System.out.println("$" + money + " of money");
	}

	public static void buy() {
		Scanner scan2 = new Scanner(System.in);
		boolean stat = true;
		System.out.println("what do you want to buy? 1- espresso, 2- latte, 3- cappuccino");
		String ans = scan2.next();
		if (ans.charAt(0) == '1') {
			if (water < 250) {
				System.out.println("Sorry, not enough water!");
				stat = false;
			}
			if (beans < 16) {
				System.out.println("Sorry, not enough beans!");
				stat = false;
			}
			if (stat) {
				water -= 250;
				beans -= 16;
				money += 4;
				cups--;
				System.out.println("I have enough resources, making you a coffee");
			}
		} else if (ans.charAt(0)  == '2') {
			if (water < 350) {
				System.out.println("Sorry, not enough water!");
				stat = false;
			}

			if (milk < 75) {
				System.out.println("Sorry, not enough milk!");
				stat = false;
			}

			if (beans < 20) {
				System.out.println("Sorry, not enough beans!");
				stat = false;
			}
			if (stat) {
				water -= 350;
				beans -= 20;
				milk -= 75;
				money += 7;
				cups--;
				System.out.println("I have enough resources, making you a coffee");
			}
		} else if (ans.charAt(0) == '3') {
			if (water < 200) {
				System.out.println("Sorry, not enough water!");
				stat = false;
			}
			if (milk < 100) {
				System.out.println("Sorry, not enough milk!");
				stat = false;
			}
			if (beans < 12) {
				System.out.println("Sorry, not enough beans!");
				stat = false;
			}
			if (stat) {
				water -= 200;
				milk -= 100;
				beans -= 12;
				money += 6;
				cups--;
				System.out.println("I have enough resources, making you a coffee");
			}
		}

	}

	public static void fill() {
		Scanner scan = new Scanner(System.in);
		System.out.println("write how many ml of water do you want to add: ");
		water += scan.nextInt();
		System.out.println("write how many ml of milk do you want to add: ");
		milk += scan.nextInt();
		System.out.println("write how many gram of coffee beans do you want to add: ");
		beans += scan.nextInt();
		System.out.println("write how many disposable cups of coffee do you want to add: ");
		cups += scan.nextInt();
	}

	static void take() {
		System.out.println("i gave you " + money);
		money = 0;
	}

}
