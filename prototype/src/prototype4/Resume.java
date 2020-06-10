package prototype4;
/*
 * 简历类
 */
public class Resume implements Cloneable{
	private String			name;
	private String			sex;
	private String			age;
	private WorkExperience	work	= new WorkExperience();

	public Resume(String name)
	{
		this.name = name;
	}

	public void setPersonalInfo(String sex, String age)
	{
		this.sex = sex;
		this.age = age;
	}

	public void setWorkExperience(String workDate, String company)
	{
		work.setWorkDate(workDate);
		work.setCompany(company);
	}

	public void display()
	{
		System.out.println(name + "		" + sex + "		" + age);
		System.out.println("工作经历：" + work.getWorkDate() + "	"
				+ work.getCompany());
	}

	public Resume clone() throws CloneNotSupportedException
	{
		return (Resume) super.clone();
	}
}
