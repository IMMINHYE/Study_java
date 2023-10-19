package practice5;

public class Employee {
	public String name;
	public String grade;
	public Employee(String name) {
		this.name = name;
	}
	
}
class Engineer extends Employee {
	private String skillset;
	
	public Engineer() {
		super("이름 없음");
	}

	public String getSkillset() {
		return skillset;
	}

	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}

}
	
