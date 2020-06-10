package prototype2;

public class ConcretePrototype1 extends Prototype{
	public ConcretePrototype1(String id)
	{
		super(id);
	}

	public Prototype clonePrototype()
	{
		try
		{
			return (Prototype) super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
