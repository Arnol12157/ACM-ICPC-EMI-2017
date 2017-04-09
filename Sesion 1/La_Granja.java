package compe;

import java.util.Scanner;

public class La_Granja
{
	public static void main(String[] args)
	{
		Scanner leer=new Scanner(System.in);
		int x,y;
		while(true)
		{
			x=leer.nextInt();
			y=leer.nextInt();
			if(x==0 && y==0)
			{
				break;
			}
			if ( y%2==0 && 2*x<=y && y<=4*x )
			{
				System.out.println(((4*x-y)/2)+" "+((y-2*x)/2));
			}
	        else
	        {
	        	System.out.println("-1");
	        }
		}
	}
}