import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalaryTest {

	@Test
	public void testCal() {
		Salary sal= new Salary(10000.0);
		sal.calNetsalary();
		assertEquals(18300.0, sal.getGs());
		assertEquals(5490.0, sal.getIncomeTax());
		assertEquals(12810.0, sal.getNetSalary());
		
	}
	
	@Test
	public void testSetBs() {
		Salary sal= new Salary(10000.0);
		sal.setBasicSalary(12000.0);
		assertEquals(12000.0, sal.getBasicSalary());
	}
}
