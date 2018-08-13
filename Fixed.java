package association;

public class Fixed {
	private double Salary;

	public Fixed(double salary) {
		super();
		Salary = salary;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	

	@Override
	public String toString() {
		return "Fixed [Salary=" + Salary + "]";
	}

	
    
    
	
	

}
