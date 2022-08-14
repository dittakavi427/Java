package TicTacToe.game;

import java.util.ArrayList;

public class Player{
	public ArrayList<Character> state=new ArrayList<>();
	
	public String symbol;

	/**
	 * @return the state
	 */
	public ArrayList<Character> getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(ArrayList state) {
		this.state = state;
	}

	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public ArrayList add(char pos) {
		this.state.add(pos);
		return this.state;
	}
	
}