package association;

public class Hourly {
	private int totalhour;
	private double hourlyrate;
	public Hourly(int totalhour, double hourlyrate) {
		super();
		this.totalhour = totalhour;
		this.hourlyrate = hourlyrate;
	}
	public int getTotalhour() {
		return totalhour;
	}
	public void setTotalhour(int totalhour) {
		this.totalhour = totalhour;
	}
	public double getHourlyrate() {
		return hourlyrate;
	}
	public void setHourlyrate(double hourlyrate) {
		this.hourlyrate = hourlyrate;
	}
	@Override
	public String toString() {
		return "Hourly [totalhour=" + totalhour + ", hourlyrate=" + hourlyrate + "]";
	}

	
	
	
}	