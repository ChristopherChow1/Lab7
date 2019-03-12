
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
		
		return -1;
	}
	public String toString() {
		return String.format("%s, a %d-year old whose illness has a severity of %d .", getName(), getAge(), severity);
	}
}
