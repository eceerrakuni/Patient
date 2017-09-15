
public class ChildPatient extends Patient {
	
	String parentName;
	
	public ChildPatient(String name, int age, String parentName) {
		super(name, age);
		this.parentName = parentName;
		
	}
	
	public String toString() {
		String childInfo = ("Patient " + name + " is " + age + " years old and has parent " + parentName);
		return childInfo;
	}
	
	public double dosage() {
		double p = 300.0;
		return p;
	}

}
