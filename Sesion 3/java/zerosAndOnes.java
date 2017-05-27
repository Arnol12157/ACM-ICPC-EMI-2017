package compe2;

import java.util.Scanner;

public class zerosAndOnes
{
	public static void main(String[] args)
	{
		Scanner leer=new Scanner(System.in);
		String characters;
		int c,a,b,cont=1;
		while(leer.hasNext())
		{
			characters=leer.nextLine();
			if(characters.length()==0)
			{
				break;
			}
			String result="Case "+cont+":\n";
			c=Integer.parseInt(leer.nextLine());
			while(c!=0)
			{
				String[] aux=leer.nextLine().split(" ");
				a=Integer.parseInt(aux[0]);
				b=Integer.parseInt(aux[1]);
				String sb=characters.substring(Math.min(a,b),Math.max(a,b)+1);
				if(sb.contains("1") && sb.contains("0"))
				{
					result+="No\n";
				}
				else
				{
					result+="Yes\n";
				}
				c--;
			}
			result=result.substring(0,result.length()-1);
			System.out.println(result);
			cont++;
		}
	}
}