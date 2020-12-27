package com.task2.testSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.task2.tests.Test_getFirst;
import com.task2.tests.Test_getLast;
import com.task2.tests.Test_getValueFromIndex;
import com.task2.tests.Test_insert;
import com.task2.tests.Test_isEmpty;
import com.task2.tests.Test_size;

@RunWith(Suite.class)
@SuiteClasses({
	Test_getValueFromIndex.class, 
	Test_insert.class, 
	Test_isEmpty.class,
	Test_size.class,
	Test_getFirst.class,
	Test_getLast.class,
})
public class TestSuite_SortedIntegerList {
	/**
	* Mutant Killed: Test_getFirst
	* Line: 16
	* Old line: assertTrue(5==list.getFirst()); 
	* New line: assertTrue(1==list.getFirst()); 
	*/
	
	/**
	* Mutant Killed: Test_getLast
	* Line: 17
	* Old line: assertTrue(15==list.getLast());
	* New line: assertTrue(5==list.getLast());
	*/
	
	/**
	* Mutant Killed: Test_getValueFromIndex
	* Line: 24
	* Old line: assertTrue(15==list.get(x));
	* New line: assertTrue(5==list.get(x));
	*/
	
	/**
	* Mutant Killed: Test_insert
	* Line: 16
	* Old line: assertTrue(5==list.get(0));
	* New line: assertTrue(15==list.get(0));
	*/
	
	/**
	* Mutant Killed: Test_isEmpty
	* Line: 15
	* Old line: assertTrue(list.isEmpty());
	* New line: list.insert(5); assertTrue(15==list.get(0));
	*/
	
	/**
	* Mutant Killed: Test_size
	* Line: 18
	* Old line: assertEquals(list.size(), 3);
	* New line: assertEquals(list.size(), 2);
	*/
}
