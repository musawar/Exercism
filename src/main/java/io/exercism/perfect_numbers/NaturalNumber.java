package io.exercism.perfect_numbers;

public class NaturalNumber {

	int number;
	public NaturalNumber(int n) {
		this.number = n;
		
		if (this.number <= 0)
			throw new IllegalArgumentException("You must supply a natural number (positive integer)");
	}
	
	
	public Classification getClassification(){
		
		int sum = 0;
		for (int i=1; i<number; i++){
			if (number%i == 0)
				sum += i;
		}
		
	
		if (sum == number)
			return Classification.PERFECT;
		
		if (sum> number)
			return Classification.ABUNDANT;
					
		return Classification.DEFICIENT;
	}
}
