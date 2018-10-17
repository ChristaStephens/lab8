package lab8;

import java.util.Scanner;

public class StudentsInClass {

	public static void main(String[] args) {
		System.out.println("Welcome to our Java class at Grand Circus, located in the snug!");
		System.out.println("We have 10 students in our class.");
		System.out.println("Which student would you like to learn more about? Please enter a number between 1-10.");
		Scanner scnr = new Scanner(System.in);
		
		String[] names = {"David", "Romel", "Adan", "Bryan", "Marque", "Sophia", "Christa", "Twani", "Tim", "Jacob"};
		String[] hometowns = {"Macomb", "Detroit", "Flint", "Sterling Heights", "Hamtramck", "Romeo", "Detroit", "Warren", "Dearborn", "Chicago"};
		String[] foods = {"Sushi", "Pizza", "Wings", "Macaroni", "Cake", "Chips", "Chocolate", "Ice Cream", "Greens", "Steak"};
		int userSelection = scnr.nextInt();

		
		System.out.println(" ");
		System.out.println(names [ userSelection -1]);
		//need to put either a try/catch or method to say(that student doesn't exist) when it goes beyond 20, or does a wrong char.
		
		
		System.out.println("What would you like to know about student number: " + userSelection + "? Please enter 'hometown' or 'favorite food'.");
		
		System.out.println(" ");
		String userSelection2 = scnr.nextLine();

		System.out.println(hometowns[userSelection -1] +" "+ foods[userSelection -1]);// this string answers the question for later!! 
		//which is Twani is from detroit and like ice cream
		//using parrells 
		
		
		
		//also need to do a try catch!
		
		//System.out.println(userSelection + "is from" +);
		
		//yes/no to continue for new student
		

	}

}
