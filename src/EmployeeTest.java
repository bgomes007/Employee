
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

	Employee empobj1 = new Employee();

	@Test
	public void testName() {
		empobj1.setname("Jasmine");
		Assert.assertEquals("Jasmine", empobj1.getname());

	}

	@Test
	public void testSalary() {
		empobj1.setsalary(4000.0);
		Assert.assertEquals(4000.0, empobj1.getsalary(), 0);

	}

	@Test
	public void testage() {
		empobj1.setage(24);
		Assert.assertEquals(24, empobj1.getage());
	}

	@Test
	public void testDesig() {
		empobj1.setdesignation("QA");
		Assert.assertEquals("QA", empobj1.getdesignation());

	}

	@Test
	public void testBonus() {

		Assert.assertEquals(100, empobj1.paybonus(empobj1.getsalary()));
	}

}
