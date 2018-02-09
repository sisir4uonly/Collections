package com.collections;

import java.util.Comparator;

public class Product {

	private final String name;

	private final int weight;

	public Product(String productName, int productWeight) {
		super();
		name = productName;
		weight = productWeight;
	}

	public String getProductName() {
		return name;
	}

	public int getProductWeight() {
		return weight;
	}

	@Override
	public String toString() {

		return "Product{ " + "name=" + name + " ; " + "weight=" + weight + " }";
	}

	public static Comparator<Product> compareByWeight = new Comparator<Product>() {

		@Override
		public int compare(Product o1, Product o2) {
			return Integer.compare(o1.getProductWeight(), o2.getProductWeight());
		}
	};

	// public static final Comparator<Product> BY_WEIGHT =
	// comparing(Product::getProductWeight);
}
