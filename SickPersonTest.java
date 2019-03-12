import org.junit.Assert;
//import org.junit.Assert.*;

import org.junit.Test;

//import junit.framework.Assert;

public class SickPersonTest {

	private int severity;

	@Test
	public void test() {
		// VV the code below tests the parameters of SickPerson VV
		Person SPT = new SickPerson("Tim", 19, severity = 5);
		Assert.assertEquals("SickPerson name is Wrong","Tim", SPT.getName());
		Assert.assertEquals("SickPerson age is wrong", 19, SPT.getAge());
		Assert.assertEquals("SickPerson severity is wrong", 5, this.severity);
		// VV the code below tests compareTo() VV
		Person SPT1 = new SickPerson("Tim", 19, severity = 7);
		Person SPT2 = new SickPerson("Tom", 19, severity = 5);
		SPT1.compareTo(SPT2);
		Assert.assertEquals("wrong order", 1, SPT1.compareTo(SPT2));
		// VV tests toString VV
		Assert.assertEquals("toString incorrect", "Tim, a 19-year old whose illness has a severity of 5.", SPT.toString());
		
	}


}
