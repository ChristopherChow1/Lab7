
public class SickPerson  extends Person{
	int severity;
	public SickPerson(String name, int age, int severity) {
		super(name, age);
		this.severity = severity;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int compareToImpl(Person p) {
		// TODO Auto-generated method stub
		SickPerson s = (SickPerson) p;
		if (!(p instanceof SickPerson)) {
			return 0;
		} else {
			if (this.severity > s.GetSeverity()){
				return 1;
			} else if (this.severity< s.GetSeverity()) {
				return -1;
			} else {
				return 0;
			}
		}
		//return severity.compareTo(p.severity);
		 
	}
	private int GetSeverity() {
		// TODO Auto-generated method stub
		return severity;
	}

	public String toString() {
		return String.format("%s, a %d-year old whose illness has a severity of %d.", getName(), getAge(), severity);
	}
}
