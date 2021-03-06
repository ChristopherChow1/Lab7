//import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class QueueHospital<PatientType> extends Hospital<PatientType> {
	Queue<PatientType> patientQueue = new LinkedList<PatientType>();
	public void addPatient(PatientType patient) {
		patientQueue.add(patient);
		return;
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
		
		return "QueueHospital";
	}
	public String allPatientInfo() {
		return QueueHospital.this.toString();
	}
}
