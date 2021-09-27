package pl.piomin.services.employee;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {
		
		List<EmpSample> emplSamples = new ArrayList<>();
		
		emplSamples.add(new EmpSample(1, "Hema", 30));
		emplSamples.add(new EmpSample(2, "Vani", 33));
		emplSamples.add(new EmpSample(3, "Kiran", 35));
		emplSamples.add(new EmpSample(4, "Kumar", 39));
		emplSamples.add(new EmpSample(5, "Sindhu", 23));
		
		for(EmpSample e: emplSamples) {
			System.out.println(e);
		}
		
		EmpSample empSample = emplSamples.get(3);
		empSample.setName("Siddhu");
		empSample.setAge(32);
		System.out.println(empSample);
		
		for(EmpSample e: emplSamples) {
			System.out.println(e);
		}
		
	
		

	}

}

class EmpSample {

	private int id;
	private String name;
	private int Age;

	public EmpSample(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		Age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		return "EmpSample [id=" + id + ", name=" + name + ", Age=" + Age + "]";
	}

}
