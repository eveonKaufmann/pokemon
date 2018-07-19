package ch.nyp.pokemon.pokemonclasses;

import java.util.ArrayList;

import ch.nyp.pokemon.pokemonattributes.*;

public abstract class Pokemon {
	
	private String name;
	private Level level;
	private int currentXp;
	private int stdHp;
	private int stdDefense;
	private ArrayList<Attack> attackList;
	
	public Pokemon() {
		
	}

	public Pokemon(String name, Level level, int currentXp, int stdHp, int stdDefense, ArrayList<Attack> attackList) {
		this.name = name;
		this.level = level;
		this.currentXp = currentXp;
		this.stdHp = stdHp;
		this.stdDefense = stdDefense;
		this.attackList = attackList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public int getCurrentXp() {
		return currentXp;
	}

	public void setCurrentXp(int currentXp) {
		this.currentXp = currentXp;
	}

	public ArrayList<Attack> getAttackList() {
		return attackList;
	}

	public void setAttackList(ArrayList<Attack> attackList) {
		this.attackList = attackList;
	}

	public int getStdHp() {
		return stdHp;
	}

	public int getStdDefense() {
		return stdDefense;
	}

	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", currentXp=" + currentXp + ", stdHp=" + stdHp + ", stdDefense=" + stdDefense
				+ "]";
	}
	
	
}
