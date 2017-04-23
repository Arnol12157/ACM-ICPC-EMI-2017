import java.util.Scanner;

class Hashmat_the_Brave_Warrior {
	public static void main(String[] args)
	{
		Scanner leer=new Scanner(System.in);
		long a,b;
		while(leer.hasNextLong())
		{
			a=leer.nextLong();
			b=leer.nextLong();
			System.out.println(Math.abs(a-b));
		}
	}
}