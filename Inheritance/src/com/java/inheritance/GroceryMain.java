package com.java.inheritance;

public class GroceryMain {

	public static void main(String[] args) {

		Item item1 = new Item("Coke Litro", 15.5, true, 5.0);
		Item item2 = new Item("RC Lemon", 18.0, true, 10.0);
		Item item3 = new Item("Sparkle", 10.0, false, 0.0);
		Item item4 = new Item("Pepsi Blue", 15.5, false, 0.0);

		GroceryBill rBill = new RegularBill();
		rBill.addItem(item1);
		rBill.addItem(item2);
		rBill.addItem(item3);
		rBill.addItem(item4);
		rBill.printReceipt();

		GroceryBill dBill = new DiscountedBill();
		dBill.addItem(item1);
		dBill.addItem(item2);
		dBill.addItem(item3);
		dBill.addItem(item4);
		dBill.printReceipt();

	}

}
