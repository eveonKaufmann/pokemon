package ch.nyp.pokemon.trainer;

import java.util.ArrayList;

import ch.nyp.pokemon.pokemonclasses.Pokemon;

public class Trainer {
	
	private String name;
	private int wins;
	private int losses;
	private ArrayList<Pokemon> pokemonList;
	
	public Trainer() {

	}
	
  public Trainer(String name, ArrayList<Pokemon> pokemonList) {
    this.name = name;
    this.wins = 0;
    this.losses = 0;
    this.pokemonList = pokemonList;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getWins() {
    return wins;
  }
  public void setWins(int wins) {
    this.wins = wins;
  }
  public int getLosses() {
    return losses;
  }
  public void setLosses(int losses) {
    this.losses = losses;
  }
  public ArrayList<Pokemon> getPokemonList() {
    return pokemonList;
  }
  public void setPokemonList(ArrayList<Pokemon> pokemonList) {
    this.pokemonList = pokemonList;
  }

  @Override
  public String toString() {
    return "Trainer [name=" + name + ", wins=" + wins + ", losses=" + losses + ", pokemonList=" + pokemonList + "]";
  }
  
  

}
