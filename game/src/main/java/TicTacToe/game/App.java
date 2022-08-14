package TicTacToe.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int a1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        List<Character> a2= new ArrayList<>();
        a2.addAll(Arrays.asList('1','2','3','4','5','6','7','8','9'));
        System.out.println(a2);
        Player p1=new Player();
        Player p2=new Player();
        System.out.println("Enter symbol for player 1:");
        Scanner in=new Scanner(System.in);
        String symbol=in.nextLine();
        p1.setSymbol(symbol);
        System.out.println("Enter symbol for player 2:");
        symbol=in.nextLine();
        p2.setSymbol(symbol);
        Rules r=new Rules();
        boolean Playerflag=false;
        boolean isWinner=false;
        while(!isWinner) {
        	System.out.print("Enter your symbol position:");
        	char pos=in.next().charAt(0);
        	if(a2.contains(pos)) {
        		
        	
        	
        	if(Playerflag) {
        		isWinner=r.isStrike(pos, p1);
        		
        		Playerflag=false;
        		if(isWinner)
        			break;
        	}else {
        		isWinner=r.isStrike(pos, p2);
        		Playerflag=true;
        		if(isWinner)
        			break;
        	}
        	a2.remove(a2.indexOf(pos));
        	}else {
        	System.out.print("Choosen place taken, choose another: ");
        	}
        		
        }
        if(Playerflag) {
        System.out.println("Winner is Player: "+p2.getSymbol());
        }else {
        System.out.println("Winner is Player: "+p1.getSymbol());
        }
        
    }
}
