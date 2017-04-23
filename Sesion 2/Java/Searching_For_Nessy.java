package compe;

import java.util.Scanner;

public class Searching_For_Nessy
{
	public static void main(String[] args)
	{
		Scanner leer=new Scanner(System.in);
//		int t=leer.nextInt();
		int n,m;
		while(true)
		{
			n=leer.nextInt();
			m=leer.nextInt();
			if(n==0 && m==0)
			{
				break;
			}
			System.out.println((int)Math.ceil(m/3)*(int)Math.ceil(n/3));
		//	t--;
		}
	}
}