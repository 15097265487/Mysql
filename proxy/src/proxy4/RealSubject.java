package proxy4;

//RealSubject类，定义Proxy所代表的真实实体。
public class RealSubject implements Subject{
	
	public void request(){
		
		System.out.println("真实的请求");
	}
}
