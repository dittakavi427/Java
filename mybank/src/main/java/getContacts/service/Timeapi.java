/**
 * 
 */
package getContacts.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import antlr.collections.List;

/**
 * @author User
 *
 */
public class Timeapi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LocalDate t=LocalDate.now();
		LocalDate t1=t.plus(1, ChronoUnit.DAYS);
		System.out.println(t1);
		int giveup=100,counter=0,i=0;
		while(true) {
			ArrayList<Integer> h=new ArrayList<Integer>();
			
			h=pop(h,i);
			if(h.size()==0) {
				counter++;
				if(counter>giveup) break;
				else
					continue;
			}
			h.forEach(s -> System.out.println(s));
			
			i++;
			
		}

	}
	
	private static ArrayList<Integer> pop(ArrayList<Integer> h,int i) {
		if(i<5) {
		h.add(7);
		h.add(8);
		
	}
		else {
			h.clear();
		}
		return h;	
		}

}
