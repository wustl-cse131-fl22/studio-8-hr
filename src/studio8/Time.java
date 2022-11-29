package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int mins;
	private boolean is24;
	
	/**
	 * 
	 * @param hour 0 ~ 23
	 * @param mins 0 ~ 59
	 * @param is24 whether the time should be shown with 12 or 24 hours format. 
	 */
	public Time(int hour, int mins, boolean is24) {
		super();
		this.hour = hour;
		this.mins = mins;
		this.is24 = is24;
	}
	@Override
	public int hashCode() {
		return Objects.hash(hour, mins);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && mins == other.mins;
	}
	@Override
	public String toString() {
		if (is24 == false && hour > 12 ){
			return "Time [hour=" + (hour - 12) + ", mins=" + mins + "]";
		}else
			return "Time [hour=" + hour + ", mins=" + mins + "]";
	}
	public static void main(String[] args) {
		Time now = new Time(15, 54, false);
		System.out.println(now);
    	
    }
	
}