package compe2;

import java.util.Scanner;
import java.util.TreeSet;

public class parking
{
	public static void main(String[] args)
	{
		Scanner leer=new Scanner(System.in);
		int stores;
		int t=leer.nextInt();
		while(t!=0)
		{
			stores=leer.nextInt();
			TreeSet<Integer> distances=new TreeSet<Integer>();
			for(int i=0;i<stores;i++)
			{
				distances.add(leer.nextInt());
			}
			System.out.println((distances.last()-distances.first())*2);
			t--;
		}
	}
}