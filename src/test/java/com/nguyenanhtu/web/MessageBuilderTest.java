package com.nguyenanhtu.web;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MessageBuilderTest {

	@Test
	void testGetHelloWorld() {
		assertEquals("hello world", MessageBuilder.getHelloWorld());
	}

	@Test
	void testGetNumber10() {
		assertEquals(10, MessageBuilder.getNumber10());
	}

}
