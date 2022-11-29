package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Appointment {
	private Date day;
	private Time time;
	
	public Appointment(Date day, Time time) {
		this.day = day;
		this.time = time;
	}

	@Override
	public String toString() {
		return "Appointment [day=" + day + ", time=" + time + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(day, other.day) && Objects.equals(time, other.time);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date D1 = new Date(11, 17, 2022,false) ;
		Date D2 = new Date(12, 25, 2022,true) ;
    	Time T1 = new Time(15, 54, false);
    	Time T2 = new Time(15, 24, true);
    	Appointment A1 = new Appointment(D1, T1);
    	Appointment A2 = new Appointment(D2, T2);
    	HashSet<Appointment> Calendar = new HashSet<Appointment>();
    	Calendar.add(A1);
    	Calendar.add(A2);
    	System.out.println(Calendar);
	}

}
