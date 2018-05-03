package com.java.inheritance;

public abstract class GroceryBill {

	protected Item[] items = new Item[200];

	public abstract double getTotalBill();

	public void addItem(Item item) {
		for (int i = 0; i < items.length; i++) {

			if (items[i] == null) {
				items[i] = item;
				break;
			}
		}
	}

	public void printReceipt() {

		Clerk clerk = new Clerk();
		System.out.println(
				"Clerk: " + clerk.getName() + "\nItem\t\tPrice\n---------------------------------------------------");
		int i = 0;
		while (items[i] != null) {
			System.out.println(items[i].getItemName() + ":\t" + items[i].getPrice());
			i++;
		}

		System.out.println("---------------------------------------------------");
		System.out.println("Total: " + getTotalBill());
		System.out.println("Happy to serve!!!");
	}
}
