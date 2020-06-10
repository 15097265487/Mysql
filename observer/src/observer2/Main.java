package observer2;

public class Main {
	public static void main(String[] args)
	{
		// 老板胡汉三
		Boss huhansan = new Boss();

		// 看股票的同事
		StockObserver tongshi1 = new StockObserver("魏关姹", huhansan);

		// 看NBA的同事
		NBAObserver tongshi2 = new NBAObserver("易管查", huhansan);

		huhansan.attach(tongshi1);
		huhansan.attach(tongshi2);

		huhansan.detach(tongshi1);

		// 老板回来了
		huhansan.setAction("我胡汉三回来了！");

		huhansan.announce();
	}
}
