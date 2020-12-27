package com.task2.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.task2.SortedIntegerList;

public class Test_size {

	@Test
	public void testSize() {
		SortedIntegerList list = null;
		assertNull(list);	
		list = new SortedIntegerList();	
		list.insert(5);
		list.insert(15);
		list.insert(25); 
		assertEquals(list.size(), 3);
	}

}
