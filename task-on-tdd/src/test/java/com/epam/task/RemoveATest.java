package com.epam.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveATest {

	
	/*
	 * Remove A if it is present in first 2 characters
	 * 1. 1'st character : ABCD = BCD
	 * 2. 1'st & 2'nd character : AACD = CD
	 * 3. 2'nd character : BACD = BCD
	 * 4. no character : BBAA = BBAA
	 * 5. remove but not after 3'rd character : AABAA = BAA	
	 */
	
	@Test
	void testFirstCharacter() {
		RemoveCharacterA removeA = new RemoveCharacterA();
		String actual = removeA.remove("ABCD");
		assertEquals("BCD",actual);
	}
	
	@Test
	void testFirstAndSecondCharacter() {
		RemoveCharacterA removeA = new RemoveCharacterA();
		String actual = removeA.remove("AACD");
		assertEquals("CD",actual);
	}
	
	@Test
	void testSecondCharacter() {
		RemoveCharacterA removeA = new RemoveCharacterA();
		String actual = removeA.remove("BACD");
		assertEquals("BCD",actual);
	}
	
	@Test
	void testForNoCharacter() {
		RemoveCharacterA removeA = new RemoveCharacterA();
		String actual = removeA.remove("BBAA");
		assertEquals("BBAA",actual);
	}
	
	@Test
	void testForNotRemovingAfterThirdCharacter() {
		RemoveCharacterA removeA = new RemoveCharacterA();
		String actual = removeA.remove("AABAA");
		assertEquals("BAA",actual);
	}
}
