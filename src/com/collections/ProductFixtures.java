package com.collections;

public class ProductFixtures {

	public static Product door = new Product("wooden door", 35);
	public static Product floorPanel = new Product("Floor Panel", 25);
	public static Product window = new Product("Glass window", 15);

	public static Supplier bobs = new Supplier("Bob's household supplies");
	public static Supplier kates = new Supplier("Kates's home goods");

	static {

		bobs.products().add(door);
		bobs.products().add(floorPanel);

		kates.products().add(floorPanel);
		kates.products().add(door);
	}

}
