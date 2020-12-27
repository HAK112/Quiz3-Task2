package com.task2.tests;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.task2.SortedIntegerList;

public class Test_insert {

	@Test
	public void testInsert() {
		SortedIntegerList list = null;
		assertNull(list); 
		list = new SortedIntegerList();
		list.insert(5);
		assertTrue(5==list.get(0));
		list.insert(3);
		assertTrue(3==list.get(0));
		list.insert(30);
		assertTrue(30==list.get(2));
	}

}
