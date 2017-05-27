package compe2;

import java.util.Scanner;

public class LoveCalculator
{
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		String a,b;
		int sumA,sumB;
		while (leer.hasNext())
		{
			a=leer.nextLine().toLowerCase();
			b=leer.nextLine().toLowerCase();
			a=a.replaceAll("[^a-z]","");
			b=b.replaceAll("[^a-z]","");
			sumA = 0;
			sumB = 0;
			for (int i=0;i<a.length();i++)
			{
				sumA+=(a.charAt(i)-'a'+1);
			}
			a=String.valueOf(sumA);
			for (int i=0;i<b.length();i++)
			{
				sumB+=(b.charAt(i)-'a'+1);
			}
			b=String.valueOf(sumB);
			while (a.length()!=1)
			{
				sumA=0;
				for (int i=0;i<a.length();i++)
				{
					sumA+=a.charAt(i)-'0';
				}
				a=String.valueOf(sumA);
			}
			while (b.length()!=1)
			{
				sumB=0;
				for (int i=0;i<b.length();i++)
				{
					sumB+=b.charAt(i)-'0';
				}
				b=String.valueOf(sumB);
			}
			if(Math.max(sumA,sumB)!=0)
			{
				float ans=((float)Math.min(sumA,sumB)/(float)Math.max(sumA,sumB))*100;
				System.out.printf("%.2f %%\n",ans);
			}
			else
			{
				System.out.println();
			}
		}
	}
}