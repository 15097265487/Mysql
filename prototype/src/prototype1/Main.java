package prototype1;

public class Main {
	public static void main(String[] args)
	{
		Resume a = new Resume("´óÄñ");
		a.setPersonalInfo("ÄÐ", "29");
		a.setWorkExperience("1998-2000", "XX¹«Ë¾");

		Resume b = a;
		Resume c = a;

		a.display();
		b.display();
		c.display();
	}
}
