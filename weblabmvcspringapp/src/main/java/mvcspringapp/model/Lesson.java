package mvcspringapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lesson {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String code;
	private String name;
	private String teacher;
	private int numofStu;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getteacher() {
		return teacher;
	}

	public void setteacher(String teacher) {
		this.teacher = teacher;
	}

	public int getnumofStu() {
		return numofStu;
	}

	public void setnumofStu(int numofStu) {
		this.numofStu = numofStu;
	}

	public Lesson() {
		super();
	}

	public Lesson(int id, String name, String code, String teacher, int numofStu) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.teacher = teacher;
		this.numofStu = numofStu;
	}

	@Override
	public String toString() {
		return "Lesson [id=" + id + ",code=" + code + ", name=" + name + ", Teacher=" + teacher
				+ ", number of students=" +  numofStu+"]";
	}
}
