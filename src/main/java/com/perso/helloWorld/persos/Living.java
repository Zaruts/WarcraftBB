package com.perso.helloWorld.persos;

import com.perso.helloWorld.Armes;

public class Living implements StandardBehaviour {

	private String nom;
	private Armes arme;
	private Boolean alive;
	private Integer age;

	public Living(String nom, Armes arme, Boolean alive, Integer age) {
		super();
		this.nom = nom;
		this.arme = arme;
		this.alive = alive;
		setAge(age);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Armes getArme() {
		return arme;
	}

	public void setArme(Armes arme) {
		this.arme = arme;
	}

	public Boolean getAlive() {
		return alive;
	}

	public void setAlive(Boolean alive) {
		this.alive = alive;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		if (age < 0) {
			System.err.println("age cannot be negative");
			return;
		} else {
			this.age = age;
		}
	}

	@Override
	public String toString() {
		return "Living [nom=" + nom + ", arme=" + arme + ", live=" + alive + ", age=" + age + "]";
	}

	public void walk(Long distance) {
		System.out.println("me déplace de " + distance);

	}

	public void fight() {
		System.out.println("me bat");

	}

	public void eat() {
		System.out.println("mange");
	}

}
