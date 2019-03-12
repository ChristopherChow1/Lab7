//import java.util.LinkedList;
import java.util.Stack;

public class StackHospital<PatientType> extends Hospital<PatientType>{
	Stack<PatientType> patientStack = new Stack<PatientType>();
		public void addPatient(PatientType patient) {
			patientStack.add(patient);
			return;
		}
		public PatientType nextPatient() {
			return patientStack.peek();
		}
		public PatientType treatNextPatient() {
			return patientStack.pop();
		}
		public int numPatients() {
			return patientStack.size();
		}
		public String hospitalType() {
			
			return "StackHospital";
		}
		public String allPatientInfo() {
			return StackHospital.this.toString();
		}
}
