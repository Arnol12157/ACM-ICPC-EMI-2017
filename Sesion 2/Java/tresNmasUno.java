package compe;

import java.util.Scanner;

public class tresNmasUno
{
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		while(leer.hasNextInt()){
			int i = leer.nextInt();
			int j = leer.nextInt();
			int _i = i;
			int _j = j;
			if(i>j)
			{
				int temp = j;
				j = i;
				i = temp;
			}
			int maxLength = 1;
			while(i<=j)
			{
				int length = 1;
				int n = i;
				while(n!=1)
				{
					if(n%2==1)
					{
						n = (3*n)+1;
						n /= 2;
						length+=2;
					}
					else
					{
						n/=2;
						length++;
					}
				}
				if(length>maxLength)
				{
					maxLength = length;
				}
				i++;
			}
			System.out.println(_i+" "+_j+" "+maxLength);
		}
	}
}