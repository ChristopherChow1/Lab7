import org.junit.Assert;

import org.junit.Test;

public class StackHospitalTest {

	@Test
	public void test() {
		StackHospital<Person> PerStack = new StackHospital<>();
		Person a = new SickPerson("tim",14,10);
		PerStack.addPatient(a);
		StackHospital<Animal> AniStack = new StackHospital<>();
		Animal b = new Animal("corgi", 4);
		AniStack.addPatient(b);
		Assert.assertEquals("Incorrect number of patients", 1, PerStack.numPatients());
		Assert.assertEquals("wrong hospital type", "StackHospital", PerStack.hospitalType());
		Assert.assertEquals("wrong patient info", "A StackHospital-type hospital with 1 patients.",PerStack.allPatientInfo());
		Assert.assertEquals("Incorrect number of patients", 1, AniStack.numPatients());
		Assert.assertEquals("wrong hospital type", "StackHospital", AniStack.hospitalType());
		Assert.assertEquals("wrong patient info", "A StackHospital-type hospital with 1 patients.",PerStack.allPatientInfo());
		
		

	}

}
