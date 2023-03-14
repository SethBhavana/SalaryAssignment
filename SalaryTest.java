import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalaryTest {

	@Test
	public void testCal() {
		Salary s= new Salary(10000.0);
		s.calNetsalary();
		assertEquals(18300.0, s.getGs());
		assertEquals(5490.0, s.getIncomeTax());
		assertEquals(12810.0, s.getNetSalary());
		
	}
	
	@Test
	public void testSetBs() {
		Salary s= new Salary(10000.0);
		s.setBasicSalary(12000.0);
		assertEquals(12000.0, s.getBasicSalary());
	}
}
