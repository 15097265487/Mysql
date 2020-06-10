package Factory2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program2 {
	public static void main(String[] args)
	{
		InputStreamReader stdin = null;
		BufferedReader bufferReader = null;

		stdin = new InputStreamReader(System.in);
		bufferReader = new BufferedReader(stdin);

		try
		{
			System.out.print("请输入数字A:");
			String numberA = bufferReader.readLine();
			System.out.print("请选择运算符(+、-、*、/):");
			String operator = bufferReader.readLine();
			System.out.print("请输入数字B:");
			String numberB = bufferReader.readLine();

			String result = "";

			if ("+".equals(operator))
			{
				result = String.valueOf(Integer.parseInt(numberA)
						+ Integer.parseInt(numberB));
			}
			else if ("-".equals(operator))
			{
				result = String.valueOf(Integer.parseInt(numberA)
						- Integer.parseInt(numberB));
			}
			else if ("*".equals(operator))
			{
				result = String.valueOf(Integer.parseInt(numberA)
						* Integer.parseInt(numberB));
			}
			else if ("/".equals(operator))
			{
				if (!"0".equals(numberB))
					result = String.valueOf(Integer.parseInt(numberA)
							/ Integer.parseInt(numberB));
				else
					result = "除数不能为0";
			}

			System.out.println("结果是:" + result);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		catch (NumberFormatException ex)
		{
			System.out.println("您输入有误:" + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
