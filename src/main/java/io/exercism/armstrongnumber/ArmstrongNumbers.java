package io.exercism.armstrongnumber;

public class ArmstrongNumbers {

	public boolean isArmstrongNumber(int number) {
		
		String strNumber = Integer.toString(number);
		int len = strNumber.length();
		int summation = 0;
		for(Character c: strNumber.toCharArray()) {
			int num = Character.getNumericValue(c);
			summation += Math.pow(num, len);
		}
		return summation == number;
	}
	
	

}
