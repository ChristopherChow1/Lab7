//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class HealthyPersonTest {
private String reason;
	@Test
	public void test() {
		Person HPT = new HealthyPerson("Tim", 19, reason = "in pain");
		Assert.assertEquals("HealthyPerson name is wrong", "Tim", HPT.getName());
		Assert.assertEquals("HealthyPerson age is wrong", 19, HPT.getAge());
		Assert.assertEquals("HealthyPerson reason is wrong", "in pain", this.reason);
		Person HPT1 = new HealthyPerson("Tim", 19, reason = "in pain");
		Person HPT2 = new HealthyPerson("Tom", 20, reason = "fatigued");
		HPT1.compareTo(HPT2);
		Assert.assertEquals("wrong order", -1, HPT1.compareTo(HPT2));
		Assert.assertEquals("Incorrect toString", "Tim, a 19-year old who is in the hospital because in pain.",HPT.toString());
	}

}
