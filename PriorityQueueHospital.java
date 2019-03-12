//import java.util.LinkedList;
import java.util.PriorityQueue;
//import java.util.Queue;

public class PriorityQueueHospital<PatientType> extends Hospital<PatientType>
{
	PriorityQueue<PatientType> patientQueue = new PriorityQueue<PatientType>();
	public void addPatient(PatientType patient) {
		patientQueue.add(patient);
		
	}
	public PatientType nextPatient() {
		return patientQueue.peek();
	}
	public PatientType treatNextPatient() {
		return patientQueue.poll();
	}
	public int numPatients() {
		return patientQueue.size();
	}
	public String hospitalType() {
		
		return "PriorityQueueHospital";
	}
	public String allPatientInfo() {
		return PriorityQueueHospital.this.toString();
	}

}
