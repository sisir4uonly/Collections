package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {

	public static final int LIGHT_VAN_MAX_WEIGHT = 20;

	private static final int PRODUCT_NOT_PRESENT = -1;

	private List<Product> lightVanProducts;
	private List<Product> heavyVanProducts;

	private final List<Product> products = new ArrayList<>();

	public void add(Product product) {
		products.add(product);
	}

	public void replace(Product oldproduct, Product newProduct) {

		final int index = products.indexOf(oldproduct);
		if (index != PRODUCT_NOT_PRESENT) {
			products.set(index, newProduct);
		}

	}

	public void prepare() {
		// sort the list
		products.sort(Product.compareByWeight);

		// find product index that need heavy van
		int splitPoint = findSplitPoint();

		// assign view of the product list for heavy and light vans
		lightVanProducts = products.subList(0, splitPoint);
		heavyVanProducts = products.subList(splitPoint, products.size());

	}

	private int findSplitPoint() {
		for (int i = 0; i < products.size(); i++) {
			final Product product = products.get(i);
			if (product.getProductWeight() > LIGHT_VAN_MAX_WEIGHT)
				return i;
		}
		return 0;
	}

	@Override
	public Iterator<Product> iterator() {
		return products.iterator();
	}

	public List<Product> getHeavyVanProducts() {

		return heavyVanProducts;
	}

	public List<Product> getLightVanProducts() {

		return lightVanProducts;
	}
}
