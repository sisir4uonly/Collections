package com.collections;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ShipmentTest {

	private Shipment shipment = new Shipment();

	@Test
	public void shouldAddItems() {
		shipment.add(ProductFixtures.door);
		shipment.add(ProductFixtures.window);

		assertThat(shipment, contains(ProductFixtures.door, ProductFixtures.window));
	}

	@Test
	public void shouldReplaceitems() {
		shipment.add(ProductFixtures.door);
		shipment.add(ProductFixtures.window);

		shipment.replace(ProductFixtures.door, ProductFixtures.floorPanel);

		assertThat(shipment, contains(ProductFixtures.floorPanel, ProductFixtures.window));
	}

	@Test
	public void shouldNotReplaceMissingItems() {
		shipment.add(ProductFixtures.window);
		shipment.replace(ProductFixtures.door, ProductFixtures.floorPanel);

		assertThat(shipment, contains(ProductFixtures.window));
	}

	@Test
	public void shouldIdentifyVanRequirements() {
		shipment.add(ProductFixtures.door);
		shipment.add(ProductFixtures.window);
		shipment.add(ProductFixtures.floorPanel);

		shipment.prepare();
		assertThat(shipment.getLightVanProducts(), contains(ProductFixtures.window));
		assertThat(shipment.getHeavyVanProducts(), contains(ProductFixtures.floorPanel, ProductFixtures.door));
	}
}
