package compe3;

import java.util.Scanner;

public class casiBrackets
{
	public static void main(String[] args)
	{
		Scanner leer=new Scanner(System.in);
		while(leer.hasNext())
		{
			int cont=0;
			String cadena=leer.next();
			for(int i=0;i<cadena.length();i++)
			{
				char a=cadena.charAt(i);
				if(a=='(')
				{
					cont++;
				}
				else
				{
					cont--;
				}
			}
			if(cont==0)
			{
				System.out.println("SI");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}