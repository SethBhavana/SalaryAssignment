
public class Salary {

	private double basicSalary;
	private double incomeTax;
	private double da;
	private double hra;
	private double gs;
	private double netSalary;
	
	public Salary(double basicSalary) {
		this.basicSalary=basicSalary;
	}
	
	public double getBasicSalary() {
		return basicSalary;
	}
	
	public void setBasicSalary(double basicSalary) {
		this.basicSalary=basicSalary;
	}
	
	public double getIncomeTax() {
		return incomeTax;
	}
	
	public double getDa() {
		return da;
	}
	
	public double getHra() {
		return hra;
	}
	
	public double getGs() {
		return gs;
	}

	public double getNetSalary() {
		return netSalary;
	}
	
	public void calNetsalary() {
		this.hra = 0.1*basicSalary;
		this.da = 0.73*basicSalary;
		this.gs = basicSalary + da + hra;
		this.incomeTax = 0.3*gs;
		this.netSalary = gs - incomeTax;
	}


}
