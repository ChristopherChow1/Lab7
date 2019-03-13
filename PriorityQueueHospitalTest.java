
import org.junit.Assert;
import org.junit.Test;

public class PriorityQueueHospitalTest {

	@Test
	public void test() {
		PriorityQueueHospital<Person> QHP = new PriorityQueueHospital<Person>();
		PriorityQueueHospital<Animal> QHA = new PriorityQueueHospital<Animal>();
		Person a = new SickPerson("tim",14,10);
		QHP.addPatient(a);
		Animal b = new Animal("corgi", 4);
		QHA.addPatient(b);
		Assert.assertEquals("Incorrect number of patients", 1, QHP.numPatients());
		Assert.assertEquals("wrong hospital type", "PriorityQueueHospital", QHP.hospitalType());
		Assert.assertEquals("wrong patient info", "A PriorityQueueHospital-type hospital with 1 patients.",QHP.allPatientInfo());
		Assert.assertEquals("Incorrect number of patients", 1, QHA.numPatients());
		Assert.assertEquals("wrong hospital type", "PriorityQueueHospital", QHA.hospitalType());
		Assert.assertEquals("wrong patient info", "A PriorityQueueHospital-type hospital with 1 patients.",QHA.allPatientInfo());
	}

}
