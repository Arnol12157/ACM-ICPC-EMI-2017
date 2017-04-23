package compe;

import java.util.Scanner;

public class Zapping
{
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		int a,b;
		while(true)
		{
			a=leer.nextInt();
			b=leer.nextInt();
			if(a==-1 && b==-1)
			{
				break;
			}
			System.out.println(Math.min(Math.abs(b-a), 100-Math.abs(b-a)));
/*			if(Math.abs(b-a)<51)
			{
				System.out.println(Math.abs(b-a));
			}
			else
			{
				System.out.println(100-b);
			}*/
		}
	}
}