package compe;

import java.util.Scanner;

public class Og {
	public static void main(String[] args)
	{
		int L,R;
		Scanner leer = new Scanner(System.in);
		while(true)
		{
			L=leer.nextInt();
			R=leer.nextInt();
			if(L==0 && R==0)
			{
				break;
			}
			System.out.println(L+R);
		}
	}
}