package net.mcmillan.populus.units;

public enum PMonth { 
	January("January", "Jan"), 
	February("February", "Feb"), 
	March("March", "Mar"), 
	April("April", "Apr"), 
	May("May", "May"), 
	June("June", "Jun"), 
	July("July", "Jul"),
	August("August", "Aug"),
	September("September", "Sep"),
	October("October", "Oct"),
	November("November", "Nov"),
	December("December", "Dec");
	
	private String name, shorthand;
	
	PMonth(String n, String s) { // TODO: Consider adding number of days per month for 31 or 30
		name = n;
		shorthand = s;
	}
	
	public String getName() {
		return name;
	}
	
	public String getShorthandName() {
		return shorthand;
	}
	
	public static PMonth getMonthFromValue(byte i) {
		switch (i) {
		case 0:
			return January;
		case 1:
			return February;
		case 2:
			return March;
		case 3:
			return April;
		case 4:
			return May;
		case 5:
			return June;
		case 6:
			return July;
		case 7:
			return August;
		case 8:
			return September;
		case 9:
			return October;
		case 10:
			return November;
		case 11:
			return December;
		default:
			throw new IllegalArgumentException("'" + i + "' invalid month!");
		}
	}
}

