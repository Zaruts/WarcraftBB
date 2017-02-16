package com.perso.helloWorld.persos;

import com.perso.helloWorld.Armes;

public class Humans extends Living{

	private Boolean barbe;

	public Humans(String nom, Armes arme, Boolean alive, Integer age, Boolean barbe) {
		super(nom, arme, alive, age);
		setBarbe(barbe);
	}

	public Humans(String nom, Armes arme, Integer age) {
		this(nom, arme, true, age, true);
	}

	public Boolean getBarbe() {
		return barbe;
	}

	public void setBarbe(Boolean barbe) {
		this.barbe = barbe;
	}

	@Override
	public String toString() {
		return "Humans [barbe=" + barbe + ", Nom=" + getNom() + ", Arme=" + getArme() + ", Alive=" + getAlive()
				+ ", Age=" + getAge() + "]";
	}

	public void walk(Long distance) {
		System.out.println(" je marche sur " + distance + " mètres");
	}

	public void fight() {
		System.out.println("je lui file un coup de " + getArme());
	}

	public void eat() {
		System.out.println("je mange élégament une bonne côte de boeuf");
	}

}
