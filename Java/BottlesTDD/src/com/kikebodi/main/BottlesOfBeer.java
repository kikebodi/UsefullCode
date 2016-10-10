package com.kikebodi.main;

public class BottlesOfBeer {
	
	private static final int MAX_NUM_BEERS = 99;
	
	public static void main(String args[]){
		for(int i=MAX_NUM_BEERS;i>=0;i--){
			System.out.println(minusOne(i));
		}
	}
	

	public static String minusOne(int num){
		String response = "";
		
		switch(num){
		case 0:
			response = "No more bottles of beer on the wall, no more bottles of beer. \n Go to the store and buy some more, "+MAX_NUM_BEERS+" bottles of beer on the wall.";
			break;
		case 1:
			response = num+" bottle of beer on the wall, "+num+" bottle of beer on the wall \n Take one downs and pass it around, no more bottles of beer in the wall";
			break;
		case 2:
			response = num+" bottles of beer on the wall, "+num+" bottles of beer on the wall \n Take one downs and pass it around,"+
					 (num-1)+" bottle of beer in the wall";
			break;
		default:
			response = num+" bottles of beer on the wall, "+num+" bottles of beer on the wall \n Take one downs and pass it around,"+
					 (num-1)+" bottles of beer in the wall";
			break;		
		}
		return response;
	}
}
