package org.Project.car.model;

public class HumanDto {
	private  int no;
	private String id;
	private String name;
	private int age;
	
	public HumanDto() {
		this(0, "", "", 0);
	}

	public HumanDto(int no, String id, String name, int age) {
		this.no = no;
		this.id = id;
		this.name = name;
		this.age = age;
	
	}

	@Override
	public String toString() {
		return "HumanDto [no=" + no + ", id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	
	
	
}
