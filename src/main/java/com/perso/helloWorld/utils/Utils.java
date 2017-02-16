package com.perso.helloWorld.utils;

public class Utils {

	/**
	 * renvoie le mois correspondant à l'index i
	 * 
	 * @param i
	 * @return
	 * @throws Exception 
	 */
	public static Months getMonthForIndex(Integer i) throws Exception {

		switch (i) {
		case 1:
			return Months.JANVIER;
		case 2:
			return Months.FEVRIER;
		case 3:
			return Months.MARS;
		case 12:
			return Months.DECEMBRE;
		default:
			throw new Exception("boulet, ya que 12 mois dans l'année");
		}

	}

}
