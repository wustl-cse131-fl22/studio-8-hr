package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean isHoliday;
	/**
	 * 
	 * @param month 1 ~ 12
	 * @param day 1 ~ 31
	 * @param year 
	 * @param isHoliday whether the date is holiday
	 */
	

    public Date(int month, int day, int year, boolean isHoliday) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}
  
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", isHoliday=" + isHoliday + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}


	public static void main(String[] args) {
    	Date D1 = new Date(11, 17, 2022,false) ;
    	Date D2 = new Date(11, 17, 2022,false) ;
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(D1);
    	list.add(D2);
    	list.add(D1);
    	System.out.println(list);
    	
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(D1);
    	set.add(D2);
    	set.add(D1);
    	System.out.println(set);
    }

}
