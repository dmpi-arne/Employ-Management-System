package association;

public class Employ {
	 private String Employname;
	 private double employNID;
	 private String Company;
	 private Fixed fixed;
	 private Hourly hourly;
	 private Commision commision;
	public Employ(String employname, double employNID, String company) {
		super();
		Employname = employname;
		this.employNID = employNID;
		Company = company;
		
	}
	public String getEmployname() {
		return Employname;
	}
	public void setEmployname(String employname) {
		Employname = employname;
	}
	public double getEmployNID() {
		return employNID;
	}
	public void setEmployNID(double employNID) {
		this.employNID = employNID;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public Commision getCommision() {
		return commision;
	}
	public void setCommision(Commision commision) {
		this.commision = commision;
	}
	
	public String totalearning(double amount) {
		return "total earning:"+amount;
	}
	@Override
	public String toString() {
		return "Employ [Employname=" + Employname + ", employNID=" + employNID + ", Company=" + Company + ", fixed="
				+ fixed + ", hourly=" + hourly + ", commision=" + commision + "]";
	}
	

	
}
