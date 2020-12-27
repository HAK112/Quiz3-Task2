package com.task2.tests;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.task2.SortedIntegerList;

public class Test_getLast {

	@Test
	public void testGetLast() { 
		SortedIntegerList list = null;
		assertNull(list);
		list = new SortedIntegerList();
		list.insert(5);
		list.insert(15);
		assertTrue(15==list.getLast());
	}

}
