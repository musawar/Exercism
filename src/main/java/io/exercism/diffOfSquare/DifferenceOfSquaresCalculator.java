package io.exercism.diffOfSquare;

public class DifferenceOfSquaresCalculator {


	public int computeSumOfSquaresTo(int n){
		
		int sum = 0;
		for (int i=1; i<=n; i++){
			sum += (i*i);
		}
		return sum;
	}

	
	public int computeSquareOfSumTo(int n){
		int sum = 0;
		for (int i=1; i<=n; i++){
			sum += i;
		}
		return sum*sum;
	}
	
	
	public int computeDifferenceOfSquares(int n){
		return computeSquareOfSumTo(n) - computeSumOfSquaresTo(n);
	}
}