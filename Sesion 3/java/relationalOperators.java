package compe2;

import java.util.Scanner;

public class relationalOperators
{
	public static void main(String[] args)
	{
		Scanner leer=new Scanner(System.in);
		int t=leer.nextInt();
		int a,b;
		while(t!=0)
		{
			a=leer.nextInt();
			b=leer.nextInt();
			if(a>b)
			{
				System.out.println(">");
			}
			else if(a<b)
			{
				System.out.println("<");
			}
			else
			{
				System.out.println("=");
			}
			t--;
		}
	}
}