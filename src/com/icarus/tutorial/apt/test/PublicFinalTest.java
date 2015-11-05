package com.icarus.tutorial.apt.test;

import com.icarus.ann.PublicFinal;

public class PublicFinalTest {

	@PublicFinal
	public final static int ABC = 100;
	
	@PublicFinal
	private static String MODULE_NAME = "APT";
	
}
