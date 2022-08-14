package cowandbull;

import java.util.Scanner;

public class Gamestart {

	public static void main(String[] args) {
		System.out.print("Provide an input for Mode: ");
		 Scanner in = new Scanner(System.in);
		 String mode = in.nextLine();
		if(mode=="userpredict") {
		HelperServiceforUserPredict h=new HelperServiceforUserPredict();
		String variant="notdone";
		System.out.print("Provide length for number: ");
		 int len = in.nextInt();
		h.setTurnNumber(len);
		do {
			System.out.print("Provide an input: ");
			 String s = in.nextLine();
		variant=h.psvm(s,len);
		}while(variant!="done");
		

	}else {
		
	}
		in.close();
	}

}
