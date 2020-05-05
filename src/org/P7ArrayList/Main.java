package org.P7ArrayList;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner (System.in);
	private static GroceryList groceryList = new GroceryList();
	
	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		printInstructions();
		
		while(!quit) {
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				quit = true;
				break;
			}
		}

	}
	
	public static void printInstructions() {
		System.out.println("0.- to print choice options.");
		System.out.println("1.- to print the grocery list.");
		System.out.println("2.- to add an item to the list.");
		System.out.println("3.- to modify an item in the list.");
		System.out.println("4.- to remove an item from the list.");
		System.out.println("5.- to search for an item in the list.");
		System.out.println("1.- to quit the application.");
		
	}

	public static void addItem() {
		System.out.print("Please enter the grocery item: ");
		groceryList.addGroceryItem(scanner.nextLine());
	}
	
	public static void modifyItem() {
		System.out.print("Enter item number: ");
		int item = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter replacement item: ");
		String newItem = scanner.nextLine();
		groceryList.modifyGroceryItem(item-1, newItem);
	}
	
	public static void removeItem() {
		System.out.print("Enter item number: ");
		int item = scanner.nextInt();
		scanner.nextLine();
		groceryList.removeGroceryItem(item-1);
	}
	
	public static void searchForItem() {
		System.out.print("Item to search for: ");
		String searchItem = scanner.nextLine();
		if(groceryList.findItem(searchItem) != null) {
			System.out.print("Found " + searchItem + " in the grocery list.");
		}else {
			System.out.println( searchItem + " is not in the grocery list.");
		}
	}
}
