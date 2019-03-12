
public class HealthyPerson extends Person{
	String reason;
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		this.reason = reason;
		// TODO Auto-generated constructor stub
	}
	@Override
	protected int compareToImpl(Person p) {
		// TODO Auto-generated method stub
		return 1;
	}
	public String toString() {
		return String.format("%s, a %d-year old who is in the hospital because %s.", getName(), getAge(), reason);
	}
}
