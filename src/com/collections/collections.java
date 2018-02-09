package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class collections {

	public static void main(String[] args) {

		Product door = new Product("Wooden Door", 35);
		Product floorPanel = new Product("Floor Panel", 25);
		Product window = new Product("Glass Window", 10);

		Collection<Product> products = new ArrayList<>();
		products.add(door);
		products.add(floorPanel);
		products.add(window);

		System.out.println(products.size());

		// final Iterator<Product> productIterator = products.iterator();
		// while (productIterator.hasNext()) {
		// Product product = productIterator.next();
		// if (product.getProductWeight() > 20) {
		// System.out.println(product);
		// } else {
		// productIterator.remove();
		// }
		//
		// }

		System.out.println(products);
		for (Product product : products) {
			if (product.getProductWeight() > 20)
				System.out.println(product);
			else
				products.add(product);
		}

		System.out.println(products.size());
	}

}
