package StackResumeProject;

public class Resume {
	
	private String name;
	private String skills;
	private String experience;
	
	public Resume(String name, String skills, String experience) {
		this.name = name;
		this.skills = skills;
		this.experience = experience;
	}
	
	public String getName() {
		return name;
	}
	public String getSkills() {
		return skills;
	}
	public String getExperience() {
		return experience;
	}
	
	@Override
	public String toString() {
		return "Name: " +name+
				"\nSkills: "+skills+
				"\nExperience: "+experience;
	}
	
}
