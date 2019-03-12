
public class HealthyPerson extends Person{
	String reason;
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		//severity = 0;
		this.reason = reason;
		// TODO Auto-generated constructor stub
	}
	@Override
	protected int compareToImpl(Person p) {
		// TODO Auto-generated method stub
		HealthyPerson name = (HealthyPerson) p;
		if (!(p instanceof HealthyPerson)) {
			return 0;
		} else {
			if (this.getAge() < name.getAge()) {
				return -1;
			} else if (this.getAge()>name.getAge()) {
				return 1;
			} else {
				return 0;
			}
		}
	}
	public String toString() {
		return String.format("%s, a %d-year old who is in the hospital because %s.", getName(), getAge(), reason);
	}
}
