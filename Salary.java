/**
 * 
 * @author Melisha
 *
 *A Salary class to calculate the NetPay of an employee.
 */
public class Salary {
	/**
	 * Declaration the variables
	 */
	private double basicSalary;
	private double incomeTax;
	/**
	 * The Dearness allowance of the employee.
	 */
	private double da;
	/**
	 * The house rent allowance of the employee.
	 */
	private double hra;
	/**
	 * The Gross salary of the employee.
	 */
	private double gs;
	private double netSalary;
	
	/**
	 * Creates a Salary constructor with the specified basic salary.
	 *  
	 * @param basicSalary
	 */
	public Salary(double basicSalary) {
		this.basicSalary=basicSalary;
	}
	
	/**
	 * @return the basic salary
	 */
	public double getBasicSalary() {
		return basicSalary;
	}
	
	/**
	 * sets the Basic Salary of the employee. 
	 * @param basicSalary
	 */
	public void setBasicSalary(double basicSalary) {
		this.basicSalary=basicSalary;
	}

	/**
	 * @return the Income Tax value.
	 */
	public double getIncomeTax() {
		return incomeTax;
	}

	/**
	 * @return the Dearness allowance
	 */
	public double getDa() {
		return da;
	}

	/**
	 * @return the House rent allowance
	 */
	public double getHra() {
		return hra;
	}

	/**
	 * @return the Gross Salary.
	 */
	public double getGs() {
		return gs;
	}

	public double getNetSalary() {
		return netSalary;
	}
	
	/**
	 *Method to calculate and set the DA,HRA,
	 *GS,Income tax and net Salary of the employee 
	 *based on the basic salary
	 */
	public void calNetsalary() {
		this.hra = 0.1*basicSalary;
		this.da = 0.73*basicSalary;
		this.gs = basicSalary + da + hra;
		this.incomeTax = 0.3*gs;
		this.netSalary = gs - incomeTax;
	}


}

