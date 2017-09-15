
public class Patient {
	
	String name;
	int age;

	public Patient(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		String info = ("Patient " + name + " is " + age + " years old.");
		return info;
	}
	
	public double dosage() {
		double p = 600.0;
		return p;
	}
	
	
	public double bmi (double heightInMeters, double weightInKilograms){
		double u = weightInKilograms/(heightInMeters * heightInMeters);
		return u;
	}
	
	public double bmi(double height, String heightUnits, double weight, String weightUnits) {
		double t = 0;
		if (heightUnits.equals("cm")) {
			if (weightUnits.equals("stone")) {
				double cmCon = height * 100;
				double weCon = weight * 6.35029;
				t = weCon/(cmCon * cmCon);
				
			} else if (weightUnits.equals("lbs")) {
				double cmCon = height * 100;
				double weCon = weight * 0.453592;
				t = weCon/(cmCon * cmCon);
			
			}
		} else if (heightUnits.equals("in")) {
			if (weightUnits.equals("stone")) {
				double cmCon = height * 0.0254;
				double weCon = weight * 6.35029;
				t = weCon/(cmCon * cmCon);
				
			} else if (weightUnits.equals("lbs")) {
				double cmCon = height * 0.0254;
				double weCon = weight * 0.453592;
				t = weCon/(cmCon * cmCon);
				
			}
		}
		return t;
		
	}
}
