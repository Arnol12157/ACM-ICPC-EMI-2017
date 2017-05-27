package compe2;

import java.util.HashMap;
import java.util.Scanner;

public class languageDetection
{
	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("HELLO", "ENGLISH");
		map.put("HOLA", "SPANISH");
		map.put("HALLO", "GERMAN");
		map.put("BONJOUR", "FRENCH");
		map.put("CIAO", "ITALIAN");
		map.put("ZDRAVSTVUJTE", "RUSSIAN");
		
		int t = 1;
		while (true)
		{
			String word = leer.next();
			if (word.equals("#"))
			{
				break;
			}
			System.out.println("Case " + t + ": " + (map.containsKey(word) ? map.get(word) : "UNKNOWN"));
			++t;
		}
	}
}