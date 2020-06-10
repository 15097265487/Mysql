package proxy4;

public class Proxy implements Subject{
	RealSubject	realSubject;

	public void request()
	{
		if (null == realSubject)
		{
			realSubject = new RealSubject();
		}
		realSubject.request();
	}
}
