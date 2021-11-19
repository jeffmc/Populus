package net.mcmillan.populus.entity;

import net.mcmillan.populus.units.PTime;

public class Human {
	private String name;
	private PTime birth;
	private Human mother;
	private Human father;
	private Gender gender;
//	private GeneSet genes; TODO: Add genes
//	private TraitSet traits; TODO: Add traits
//	private Activities schedule; TODO: Add activities
	
	private Human() {
		
	}
	
	private static Human random() {
		return null;
	}
}
