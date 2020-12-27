package com.task2.tests;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.task2.SortedIntegerList;

public class Test_getValueFromIndex {
	@SuppressWarnings("deprecation")
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	@Test
	public void testGet() { 
		int x;
		SortedIntegerList list = null;
		assertNull(list); 
		list = new SortedIntegerList();
		list.insert(5);
		list.insert(15);
		list.insert(25);
		x=1;
		assertTrue(15==list.get(x));
		x=5;
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("incorrect index "+x);		
		list.get(x);
	}

}