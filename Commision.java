package association;

public class Commision {

	private double commisionrate;
	private double grosssale;
	public Commision(double commisionrate, double grosssale) {
		super();
		this.commisionrate = commisionrate;
		this.grosssale = grosssale;
	}
	public double getCommisionrate() {
		return commisionrate;
	}
	public void setCommisionrate(double commisionrate) {
		this.commisionrate = commisionrate;
	}
	public double getGrosssale() {
		return grosssale;
	}
	public void setGrosssale(double grosssale) {
		this.grosssale = grosssale;
	}
	@Override
	public String toString() {
		return "Commision [commisionrate=" + commisionrate + ", grosssale=" + grosssale + "]";
	}
	
	
	
	
}