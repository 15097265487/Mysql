package proxy2;

public class Proxy {
	Girl	mm;

	public Proxy(Girl mm)
	{
		this.mm = mm;
	}

	public void giveDolls()
	{
		System.out.println(mm.name + " ËÍÄãÑóÍŞÍŞ");
	}

	public void giveFlowers()
	{
		System.out.println(mm.name + " ËÍÄãÏÊ»¨");
	}

	public void giveChocolate()
	{
		System.out.println(mm.name + " ËÍÄãÇÉ¿ËÁ¦");
	}
}
