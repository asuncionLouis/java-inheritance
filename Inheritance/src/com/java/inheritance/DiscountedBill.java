package com.java.inheritance;

public class DiscountedBill extends GroceryBill {

	public DiscountedBill() {
		System.out.println("\n\t\t>>>>Discounted Bill<<<<\n");
	}

	@Override
	public double getTotalBill() {
		double totalBill = 0.0;

		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				break;
			}

			if (items[i].isDiscounted()) {
				totalBill += items[i].getPrice() * ((100 - items[i].getDiscountRate()) / 100);
			} else {
				totalBill += items[i].getPrice();
			}
		}

		return totalBill;
	}
}
