package com.perso.helloWorld;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.perso.helloWorld.utils.Months;
import com.perso.helloWorld.utils.Utils;

import junit.framework.TestCase;

@RunWith(JUnit4.class)
public class UtilsTest extends TestCase {

	@Test
	public void month1isJanvier() {
		try {
			assert (Utils.getMonthForIndex(1).equals(Months.JANVIER));
		} catch (Exception e) {

			assert (false);
			e.printStackTrace();
		}
	}

	@Test
	public void month2isFevrier() {
		try {
			assert (Utils.getMonthForIndex(2).equals(Months.FEVRIER));
		} catch (Exception e) {
			assert (false);
			e.printStackTrace();
		}
	}

	@Test
	public void month3isMars() {
		try {
			assert (Utils.getMonthForIndex(3).equals(Months.MARS));
		} catch (Exception e) {
			assert (false);
			e.printStackTrace();
		}
	}

	@Test
	public void month3DoesntThrowsException() {
		try {
			Utils.getMonthForIndex(3);
		} catch (Exception e) {
			assert (false);
			e.printStackTrace();
		}
		assert (true);
	}

	@Test
	public void month13ThrowsException() {
		try {
			Utils.getMonthForIndex(13);
		} catch (Exception e) {

			e.printStackTrace();
			assert (true);
			return;
		}

		assert (false);

	}
}
