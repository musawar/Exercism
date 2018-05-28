package io.exercism.triangle;

public class Triangle {

    	private double side1;
    	private double side2;
    	private double side3;
	
		public Triangle(double side1, double side2, double side3) throws TriangleException{
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
			checkTriangleInEquality();
		}
		
		public boolean isEquilateral(){
			return (side1==side2 && side2==side3);
		}
		
		/* An isosceles triangle has at least two sides the same length. (It is sometimes specified as having exactly two sides the same length, but for the purposes of this exercise we'll say at least two.)*/
		public boolean isIsosceles(){
			return (
					(side1==side2) || (side1==side3) || (side2 == side3)
					);
		}
		
		/* A scalene triangle has all sides of different lengths. */
		public boolean isScalene(){
			return (side1!=side2 && side2!=side3 && side1!=side3);
		}

		
		public void checkTriangleInEquality() throws TriangleException{
			if (side1==side2 && side2==side3 && side1==0  )
				throw new TriangleException();
			
			if (side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2)
				throw new TriangleException();
		}
     

  
}