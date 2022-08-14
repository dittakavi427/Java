package cowandbull;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HelperServiceforUserPredict {
	
	public String variant="notdone";
	public static String turnNumber="";
	
	public void setTurnNumber(int length){
		List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8,9);
		Collections.shuffle(l);
		for(int i=0;i<length;i++) {
			HelperServiceforUserPredict.turnNumber+=l.get(i)+"";
		}
	}
	/**
	 * @return the turnNumber
	 */
	public String getTurnNumber() {
		
		return turnNumber;
	}


	/**
	 * @param turnNumber the turnNumber to set
	 */
	


	public String psvm(String number,int len) {
		
		if(number.length()!=len || number.chars().distinct().count()!=number.length()) {
			System.out.println("Provide number without repetition in digits or provide "+len+" digit number");
			return variant;
		}
		
		turnNumber=getTurnNumber();
	
		int cows=0;
		int bulls=0;
		//find bulls
		
		for(int i=0;i<number.length();i++) {
			if(number.charAt(i)==turnNumber.charAt(i)) {
				bulls++;
			}
			
			}
			System.out.println("bulls "+bulls);
		//find cows
			for(int i=0;i<number.length();i++) {
				int l=turnNumber.indexOf(number.charAt(i));
				if(l>=0 && l!=i)
				{
					cows++;
				}
			}
			System.out.println("cows "+cows);
			
			if(bulls==number.length()) {
				System.out.println("Number predicted promptly as "+turnNumber);
				variant="done";
			}
		return variant;

	}

}
