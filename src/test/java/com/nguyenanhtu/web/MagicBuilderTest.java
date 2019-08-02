package com.nguyenanhtu.web;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MagicBuilderTest {

	@Test
	void testGetLucky() {
		assertEquals(7, MagicBuilder.getLucky());
	}
}
