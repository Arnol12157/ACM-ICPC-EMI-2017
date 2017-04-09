package compe;
import java.util.Arrays;
import java.util.Scanner;

public class ElEstaEnFueraDeJuego
{
	public static void main(String[] args)
	{
		Scanner leer =new Scanner(System.in);
		while(true)
		{
			int A=leer.nextInt();
			int D=leer.nextInt();
			if(A==0 && D==0)
			{
				break;
			}
			int[] ataque=new int[A];
			int[] defensa=new int[D];
			for(int i=0;i<A;i++)
			{
				ataque[i]=leer.nextInt();
			}
			for(int i=0;i<D;i++)
			{
				defensa[i]=leer.nextInt();
			}
			Arrays.sort(ataque);
			Arrays.sort(defensa);
			if(ataque[0]<defensa[1])
			{
				System.out.println("Y");
			}
			else
			{
				System.out.println("N");
			}
		}
	}
}