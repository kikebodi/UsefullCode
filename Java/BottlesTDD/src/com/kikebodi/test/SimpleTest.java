package com.kikebodi.test;

import org.junit.Assert;
import org.junit.Test;

import com.kikebodi.main.BottlesOfBeer;

public class SimpleTest {

	@Test
	public void test() {
		int num = 99;
		String response = BottlesOfBeer.minusOne(num);
		String expected = num+" bottles of beer on the wall, "+num+" bottles of beer on the wall \n Take one downs and pass it around,"+
		+ (num-1)+" bottles of beer in the wall";
		
		Assert.assertEquals(expected, response);
	}
	
	@Test 
	public void testCase2(){
		int num = 2;
		String response = BottlesOfBeer.minusOne(num);
		String expected = num+" bottles of beer on the wall, "+num+" bottles of beer on the wall \n Take one downs and pass it around,"+
				+ (num-1)+" bottle of beer in the wall";
		Assert.assertEquals(expected, response);
	}
	
	@Test 
	public void testCase1(){
		int num = 1;
		String response = BottlesOfBeer.minusOne(num);
		String expected = num+" bottle of beer on the wall, "+num+" bottle of beer on the wall \n Take one downs and pass it around, no more bottles of beer in the wall";
		Assert.assertEquals(expected, response);
	}
	
	@Test 
	public void testCase0(){
		int num = 0;
		String response = BottlesOfBeer.minusOne(num);
		String expected = "No more bottles of beer on the wall, no more bottles of beer. \n Go to the store and buy some more, 99 bottles of beer on the wall.";
		Assert.assertEquals(expected, response);
	}

}
