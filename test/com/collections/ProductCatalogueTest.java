package com.collections;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ProductCatalogueTest {

	@Test
	public void shouldOnlyHoldUniqueProducts() {

		ProductCatalogue catalogue = new ProductCatalogue();
		catalogue.isSuppliedBy(ProductFixtures.bobs);
		catalogue.isSuppliedBy(ProductFixtures.kates);

		assertThat(catalogue, containsInAnyOrder(ProductFixtures.door, ProductFixtures.floorPanel));
	}

}
