package io.exercism.twofer;

public class Twofer {

	
	public String twofer(String input){
		
		String subject = (input==null) ? "you" : input;
		String result = "One for "+subject+", one for me.";
		return result;
		
	}
}
