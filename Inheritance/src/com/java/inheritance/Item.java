package com.java.inheritance;

public class Item {

	public Item() {

	}

	public Item(String itemName, double price, boolean isDiscounted, double discountRate) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.isDiscounted = isDiscounted;
		this.discountRate = discountRate;
	}

	private String itemName;
	private double price;
	private boolean isDiscounted;
	private double discountRate;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isDiscounted() {
		return isDiscounted;
	}

	public void setDiscounted(boolean isDiscounted) {
		this.isDiscounted = isDiscounted;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

}
