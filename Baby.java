// #2

// Class Declaration
public class Baby {
	
	
	// Instance variables
	
	private String name;
	private int age;
	private String personality;
	
	
	// Constructors
	
	public Baby() {}
	
	public Baby(int age, String personality) {
		this.age = age;
		this.personality = personality;
	}
	
	public Baby(String name, int age, String personality) {
		this.name = name;
		this.age = age;
		this.personality = personality;
	}
	
	
	// Get methods
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPersonality() {
		return personality;
	}
	
	
	// Set methods
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public void setPersonality(String newPersonality) {
		this.personality = newPersonality;
	}
	
	
	// Method that returns boolean
	
	public Boolean isCute() {
		return true;
	}
	
	
	// Method that returns string
	
	public String babyRowan() {
		return "My baby is the cutest.";
	}

}
