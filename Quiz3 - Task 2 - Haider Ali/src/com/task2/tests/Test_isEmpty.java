package com.task2.tests;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.task2.SortedIntegerList;

public class Test_isEmpty {

	@Test
	public void testIsEmpty() {
		SortedIntegerList list = null;
		assertNull(list);
		list = new SortedIntegerList();	
		assertTrue(list.isEmpty());
	} 

}
