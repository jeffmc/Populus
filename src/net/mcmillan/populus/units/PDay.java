package net.mcmillan.populus.units;

public enum PDay {
	Monday("Monday", "Mon"), 
	Tuesday("Tuesday", "Tue"),
	Wednesday("Wednesday", "Wed"), 
	Thursday("Thursday", "Thu"), 
	Friday("Friday", "Fri"), 
	Saturday("Saturday", "Sat"), 
	Sunday("Sunday", "Sun");

	private String name, shorthand;
	
	PDay(String n, String s) {
		name = n;
		shorthand = s;
	}
	
	public String getName() {
		return name;
	}
	
	public String getShorthandName() {
		return shorthand;
	}
	
	public static PDay getDayFromValue(byte i) {
		switch (i) {
		case 0:
			return Saturday;
		case 1:
			return Sunday;
		case 2:
			return Monday;
		case 3:
			return Tuesday;
		case 4:
			return Wednesday;
		case 5:
			return Thursday;
		case 6:
			return Friday;
		default:
			throw new IllegalArgumentException("'" + i + "' invalid day!");
		}
	}
}
