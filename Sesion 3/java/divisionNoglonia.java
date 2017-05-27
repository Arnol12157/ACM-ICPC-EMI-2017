package compe2;

import java.util.Scanner;

public class divisionNoglonia
{
	public static void main(String[] args)
	{
		Scanner leer=new Scanner(System.in);
		int k,x,y,qx,qy;
		
		while(true)
		{
			k=leer.nextInt();
			if(k==0)
			{
				break;
			}
			x=leer.nextInt();
			y=leer.nextInt();
			while(k!=0)
			{
				qx=leer.nextInt();
				qy=leer.nextInt();
				if(qx==x || qy==y)
				{
					System.out.println("divisa");
				}
				else if(qx<x && qy<y)
				{
					System.out.println("SO");
				}
				else if(qx>x && qy>y)
				{
					System.out.println("NE");
				}
				else if(qx<x && qy>y)
				{
					System.out.println("NO");
				}
				else
				{
					System.out.println("SE");
				}
				k--;
			}
		}
	}
}