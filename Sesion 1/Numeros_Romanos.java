package compe;

import java.util.Scanner;

public class Numeros_Romanos
{
	public static void main(String[] args)
	{
		int  x, i;
		int  Vn[]={ 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String Vc[]={"m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", "v", "iv", "i"};
		Scanner leer = new Scanner( System.in );
		while( true )
		{
			x = leer.nextInt();
			if(x==0)
			{
				break;
			}
			System.out.print(x+" ");
		    i=0;
		    while(x>0)
		    {
		    	if(x>=Vn[i])
		    	{
		    		System.out.print(Vc[i]);
		    		x=x-Vn[i];
		    	}
		    	else
		    	{
		    		i++;
		    	}
		    }
		    System.out.println();
		}
	}
}