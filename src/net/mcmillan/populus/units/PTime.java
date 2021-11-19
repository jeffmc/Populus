package net.mcmillan.populus.units;

public class PTime {
	// TODO: Timezones
	// TODO: 28, 30, 31 day months
	private long seconds; // seconds are smallest unit of time in Populus, 86400, this allows for 584942417355 years.
	
	private static final int SECONDS_IN_DAY = 24*60*60;
	private static final int DAYS_IN_YEAR = 365;
	
	public long getYear() {
		return Math.floorDiv(Math.floorDiv(seconds, SECONDS_IN_DAY), DAYS_IN_YEAR);
	}
	
	
	
	public byte getHour() {
		if (seconds >= SECONDS_IN_DAY) throw new IllegalStateException("Illegal time: " + seconds + "!");
		return (byte) Math.floorDiv(seconds, 60*60);
	}
	
	public byte getMinute() {
		if (seconds >= SECONDS_IN_DAY) throw new IllegalStateException("Illegal time: " + seconds + "!");
		return (byte) (Math.floorDiv(seconds, 60) % 60);
	}
	
	public byte getSeconds() {
		if (seconds >= SECONDS_IN_DAY) throw new IllegalStateException("Illegal time: " + seconds + "!");
		return (byte) (seconds % 60);
	}
	
	
	public String getDateString() { // EX: Wed, 17 Nov 2021 14:10:56
		return null; // TODO: Fix this
//		return getDay().getName() + ", " + day + getOrdinalIndicator(day) + " "
//			+ getMonth().getShorthandName() + " " + getYear() + " "
//			+ getHour() + ":" + getMinute() + ":" + getSeconds();
	}
	
	public PTime(int year, byte month, byte day, int seconds) {
//		this.year = year; TODO: Fix this constructor
//		this.month = month;
//		this.day = day;
		this.seconds = seconds;
	}
	
	public static PTime random() {
		return new PTime((int) (Math.random()*200 + 1900), 
				(byte) (Math.random()*12), 
				(byte) (Math.random()*31), 
				(int)(Math.random()*SECONDS_IN_DAY));
	}
	
	public static String getOrdinalIndicator(int in) {
		if (in%100 == 11 || in%100 == 12 || in%100 == 13) return "st";
		switch (in%10) {
		case 1:
			return "st";
		case 2:
			return "nd";
		case 3:
			return "rd";
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 0:
			return "th";
		default:
			throw new IllegalArgumentException("Couldn't find numeral ending for '" + in +"'!");
		}
	}
	
	
}
