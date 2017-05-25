package ro.ase.cts.unit.testing;

import java.util.ArrayList;

public class Student {
	int age;
	ArrayList<Integer> grades;
	
	public Student(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(Integer age) {

		if(age == null)
			throw new IllegalArgumentException();
		if(age > 99)
			throw new IllegalArgumentException();
		if(age < 10)
			throw new IllegalArgumentException();
		this.age = age;
	}
	
	public void addGrade(Integer grade){
		this.grades.add(grade);
	}
	
	public int minGrade(){
		int min = this.grades.get(0);
		for(int value : grades)
			if(min > value)
				min = value;
		return min;
	}
	
}
