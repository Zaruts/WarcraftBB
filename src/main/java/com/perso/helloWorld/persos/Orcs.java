package com.perso.helloWorld.persos;

import com.perso.helloWorld.Armes;

public class Orcs extends Living {

	
	public static Integer nbr = 0;
	
	private Boolean cornes;

	public Orcs(String nom, Armes arme, Boolean live, Integer age, Boolean cornes) {
		super(nom, arme, live, age);
		setCornes(cornes);
		nbr++;
	}

	public Orcs(String nom, Armes arme, Integer age) {
		this(nom, arme, true, age, true);
	}

	public Boolean getCornes() {
		return cornes;
	}

	public void setCornes(Boolean cornes) {
		this.cornes = cornes;
	}

	@Override
	public String toString() {
		return "Orcs [cornes=" + cornes + ", Nom=" + getNom() + ", Arme=" + getArme() + ", Alive=" + getAlive()
				+ ", Age=" + getAge() + "]";
	}
	
	@Override
	public void fight() {
		System.out.println("je me bats comme une brute");
	}
	
	@Override
	public void eat() {
		System.out.println("je bouffe une vache");
	}
	
	@Override
	public void walk(Long distance) {
		System.out.println("je cours sur " + distance + " mètres");
	}

}
