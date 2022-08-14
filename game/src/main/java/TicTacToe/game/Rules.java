package TicTacToe.game;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Rules {
	
	//Strike combinations1
	
	List<String> combinations= Arrays.asList("123","456","789","159","258","369","147","357");
	boolean winner=false;
	
	@SuppressWarnings({ "unlikely-arg-type", "unchecked" })
	public boolean isStrike(char pos,Player p) {
		p.add(pos);
		
		System.out.println(p.getState().contains(Arrays.asList(combinations.get(0).toCharArray())));
		
		String s=(String) p.getState().stream().sorted().map(Object::toString).collect(Collectors.joining());
		System.out.println(p.getSymbol()+ " value now is "+s);
		winner=combinations.contains(s);
		System.out.println(winner);
		return winner;
	}

}
