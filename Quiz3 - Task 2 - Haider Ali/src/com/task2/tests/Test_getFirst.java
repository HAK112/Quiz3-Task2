package com.task2.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.task2.SortedIntegerList;

public class Test_getFirst {
	@Test
	public void testGetFirst() {
		SortedIntegerList list = null;
		assertNull(list);
		list = new SortedIntegerList();
		list.insert(5);
		list.insert(15);
		assertTrue(5==list.getFirst()); 
	}
}
