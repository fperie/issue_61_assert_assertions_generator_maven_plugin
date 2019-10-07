package fr.mycompany.serviceb.model;

import java.util.Date;

public class MyEntityServiceB
{
	private String id;

	private String name;

	private Date birthday;

	private int age;

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Date getBirthday()
	{
		return birthday;
	}

	public void setBirthday(Date birthday)
	{
		this.birthday = birthday;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "MyEntityServiceB [id=" + id + ", name=" + name + ", birthday=" + birthday + ", age=" + age + "]";
	}
}
