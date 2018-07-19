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
	
  public Trainer(String name, int wins, int losses, ArrayList<Pokemon> pokemonList) {
    this.name = name;
    this.wins = wins;
    this.losses = losses;
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

}
