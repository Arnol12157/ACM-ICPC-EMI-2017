package compe;

import java.util.Scanner;

public class Laser_Sculpture
{
	public static void main(String[] args)
	{
		Scanner leer=new Scanner(System.in);
		int A,C;
		while(true)
		{
			A=leer.nextInt();
			C=leer.nextInt();
			if(A==0 && C==0)
			{
				break;
			}
			int[] X=new int[C];
			for(int i=0;i<C;i++)
			{
				X[i]=leer.nextInt();
			}
			int cont=0;
			if(A>X[0])
			{
				cont=A-X[0];
			}
			for(int i=0;i<(C-1);i++)
			{
				if(X[i]>X[i+1])
				{
					cont+=(X[i]-X[i+1]);
				}
			}
			System.out.println(cont);
			/*
			int[][] sculpt=new int[C][A];
			for(int j=0;j<C;j++)
			{
				for(int k=0;k<X[j];k++)
				{
					sculpt[j][k]=1;
				}
			}
			int cont=0;
			for(int j=0;j<A;j++)
			{
				for(int k=0;k<C;k++)
				{
//					System.out.print(sculpt[k][j]);
					if(sculpt[k][j]==0 && k<(C-1) && sculpt[k+1][j]==1)
					{
						cont++;
					}
					else if(sculpt[k][j]==0 && k==(C-1))
					{
						cont++;
					}
				}
//				System.out.println();
			}
			System.out.println(cont);
			*/
		}
	}
}