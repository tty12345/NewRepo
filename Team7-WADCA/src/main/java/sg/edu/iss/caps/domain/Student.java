package sg.edu.iss.caps.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String firstName;
	
	private String secondName;
	
	private String major;
	
	private double gpa;
	
	private int creditsTaken;
	
	//private Course coursesTaken;

	public Student(String firstName, String secondName, String major, double gpa, int creditsTaken) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.major = major;
		this.gpa = gpa;
		this.creditsTaken = creditsTaken;
	}
	public Student(String firstName, String secondName, String major) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.major = major;
	}
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getCreditsTaken() {
		return creditsTaken;
	}
	public void setCreditsTaken(int creditsTaken) {
		this.creditsTaken = creditsTaken;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", major=" + major
				+ ", gpa=" + gpa + ", creditsTaken=" + creditsTaken  + "]";
	}
	
}