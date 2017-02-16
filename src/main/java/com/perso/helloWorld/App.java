package com.perso.helloWorld;

import com.perso.helloWorld.persos.Humans;
import com.perso.helloWorld.persos.Orcs;

/**
 * Hello warcraft
 * done by zaruts
 *
 */
public class App {
	public static final String NOM_APPLI ="WARCRAFT v0.1";
	
	public static void main(String... args) {

		System.out.println(App.NOM_APPLI);
		Orcs orc1 = new Orcs("plop", Armes.HACHE, 25);
		System.out.println(Orcs.nbr);
		Orcs orc2 = new Orcs("toto", Armes.LANCE, 35);
		System.out.println(Orcs.nbr);
		Orcs orc3 = new Orcs("tototata", Armes.LANCE, true, 35, false);
		System.out.println(Orcs.nbr);

		Humans hum1 = new Humans("humain", Armes.SORT, 60);

		System.out.println(orc1.toString());
		System.out.println(orc2.toString());
		System.out.println(orc3.toString());
		System.out.println(hum1.toString());

		System.out.println();

		orc1.eat();
		hum1.eat();

		orc1.fight();
		hum1.fight();

	}
}
