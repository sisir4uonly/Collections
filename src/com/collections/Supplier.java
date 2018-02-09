package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Supplier {

	private final String supplierName;
	private final List<Product> products = new ArrayList<>();

	public String getSupplierName() {
		return supplierName;
	}

	public Supplier(String supplierName) {
		this.supplierName = supplierName;
	}

	public List<Product> products() {
		return products;
	}

	@Override
	public String toString() {
		return "Supplier [supplierName=" + supplierName + ", products=" + products + "]";
	}
}
