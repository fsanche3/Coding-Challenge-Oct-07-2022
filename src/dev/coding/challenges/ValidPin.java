package dev.coding.challenges;

public class ValidPin {
	/*
	(i)Create a function that will test if a string is a valid PIN or not via a regular expression.

	A valid PIN has Exactly 4 or 6 characters. Only numeric characters (0-9).
		
	No whitespace.
	Examples
	validate("121317") ➞ true
	validate("1234") ➞ true
	validate("45135") ➞ false
	validate("89abc1") ➞ false
	Empty strings should return false when tested.
*/
	
	public static void main(String[] args) {
		String string = "1234";
		System.out.println(validate(string));
	}
	
	static boolean validate(String string) {
			
		char[] arr = string.toCharArray();
		int length = arr.length;

		if(string.equals("")) return false;
		
		for(int i = 0; i < arr.length; i++) {
			if(!Character.isDigit(arr[i])) {
				return false;
			} 
		}
		
		if(length == 4 || length == 6) {
			return true;
		} else {
			return false;
		}
		
	}
}
