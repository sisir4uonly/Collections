package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductCatalogue implements Iterable<Product> {

	private List<Product> products = new ArrayList<>();
	// private Set<Product> products = new HashSet<>();

	public void isSuppliedBy(Supplier supplier) {

		products.addAll(supplier.products());

	}

	@Override
	public Iterator<Product> iterator() {

		return products.iterator();
	}

}
