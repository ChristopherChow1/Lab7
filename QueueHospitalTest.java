
import org.junit.Assert;
import org.junit.Test;

public class QueueHospitalTest {

	@Test
	public void test() {
		QueueHospital<Person> QHP = new QueueHospital<Person>();
		QueueHospital<Animal> QHA = new QueueHospital<Animal>();
		Person a = new SickPerson("tim",14,10);
		QHP.addPatient(a);
		Animal b = new Animal("corgi", 4);
		QHA.addPatient(b);
		Assert.assertEquals("Incorrect number of patients", 1, QHP.numPatients());
		Assert.assertEquals("wrong hospital type", "QueueHospital", QHP.hospitalType());
		Assert.assertEquals("wrong patient info", "A QueueHospital-type hospital with 1 patients.",QHP.allPatientInfo());
		Assert.assertEquals("Incorrect number of patients", 1, QHA.numPatients());
		Assert.assertEquals("wrong hospital type", "QueueHospital", QHA.hospitalType());
		Assert.assertEquals("wrong patient info", "A QueueHospital-type hospital with 1 patients.",QHA.allPatientInfo());
	}

}
