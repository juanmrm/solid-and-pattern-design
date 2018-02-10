package com.demo.pattern.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Hamburguesa {

	public enum Carne { VACUNO, POLLO }
	public enum Size { MEDIO, GRANDE, EXTRA_GRANDE }
	public enum Extra { CEBOLLA, QUESO, MAYONESA, PEPINO, HUEVO }
	public enum Pan { NORMAL, CON_SEMILLAS }
	
	private final Carne carne;
	private final Size size;
	private final Pan pan;
	private final List<Extra> extras;

}
