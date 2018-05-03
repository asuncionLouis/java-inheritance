package com.java.inheritance;

public class RegularBill extends GroceryBill {

	public RegularBill() {
		System.out.println("\n\t\t>>>>Regular Bill<<<<\n");
	}

	@Override
	public double getTotalBill() {
		double totalBill = 0.0;

		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				break;
			}

			totalBill += items[i].getPrice();
		}

		return totalBill;
	}

}
