package compe;

import java.util.Scanner;

public class The_Snail
{
	public static void main(String[] args)
	{
		Scanner leer=new Scanner(System.in);
		double H,U,D,F,distance,slide;
		int cont=0;
		while(true)
		{
			H=leer.nextDouble();
			U=leer.nextDouble();
			D=leer.nextDouble();
			F=leer.nextDouble();
			if(H==0)
			{
				break;
			}
			slide=U*(F/100);
			distance=0;
			cont=1;
			while(true)
			{
				distance+=U;
				U=Math.max(0, U-slide);
				if(distance>H)
				{
					break;
				}
				distance-=D;
				if(distance<0)
				{
					break;
				}
				cont++;
			}
			if(distance>H)
			{
				System.out.println("success on day "+cont);
			}
			else if(distance<0)
			{
				System.out.println("failure on day "+cont);
			}
		}
	}
}