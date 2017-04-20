package compe;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bender
{
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		int L;
		String j,current="+x",aux;
		HashMap<String,String> map=new HashMap<String,String>();
		//Para +x
		map.put("+x+x", "+x");
		map.put("+x-x", "+x");
		map.put("+x+y", "+y");
		map.put("+x-y", "-y");
		map.put("+x+z", "+z");
		map.put("+x-z", "-z");
		//Para -x
		map.put("-x+x", "-x");
		map.put("-x-x", "+x");
		map.put("-x+y", "-y");
		map.put("-x-y", "+y");
		map.put("-x+z", "-z");
		map.put("-x-z", "+z");
		//Para +y
		map.put("+y+x", "+y");
		map.put("+y-x", "-y");
		map.put("+y+y", "-x");
		map.put("+y-y", "+x");
		map.put("+y+z", "+y");
		map.put("+y-z", "+y");
		//Para -y
		map.put("-y+x", "-y");
		map.put("-y-x", "+y");
		map.put("-y+y", "+x");
		map.put("-y-y", "-x");
		map.put("-y+z", "-y");
		map.put("-y-z", "-y");
		//Para +z
		map.put("+z+x", "+z");
		map.put("+z-x", "-z");
		map.put("+z+y", "+z");
		map.put("+z-y", "+z");
		map.put("+z+z", "-x");
		map.put("+z-z", "+x");
		//Para -z
		map.put("-z+x", "-z");
		map.put("-z-x", "+z");
		map.put("-z+y", "-z");
		map.put("-z-y", "-z");
		map.put("-z+z", "+x");
		map.put("-z-z", "-x");
		
		while(true)
		{
			L=leer.nextInt();
			if(L==0)
			{
				break;
			}
			leer.nextLine();
			j=leer.nextLine();
			current="+x";
			StringTokenizer token=new StringTokenizer(j," ");
			while(token.hasMoreElements())
			{
				aux=token.nextElement().toString();
				if (!aux.equals("No"))
				{
					current=map.get(current+aux);
				}
			}
			System.out.println(current);
		}
	}
}
