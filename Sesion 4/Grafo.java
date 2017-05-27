package avanzados;

import java.util.ArrayList;

public class Grafo
{
	/*
    public int[][] g = {{2, 1, 0, 1, 0},
                        {1, 2, 1, 0, 0},
                        {0, 1, 2, 0, 0},
                        {1, 0, 0, 2, 1},
                        {0, 0, 0, 1, 2}};
    */
	
    public int[][] g = {{2, 1, 0, 0, 0, 1, 0, 0, 0},
    					{1, 2, 1, 1, 0, 0, 0, 0, 0},
			    		{0, 1, 2, 0, 1, 0, 0, 0, 0},
			    		{0, 1, 0, 2, 0, 0, 0, 0, 0},
			    		{0, 0, 1, 0, 2, 0, 0, 0, 0},
			    		{1, 0, 0, 0, 0, 2, 1, 0, 0},
			    		{0, 0, 0, 0, 0, 1, 2, 1, 1},
			    		{0, 0, 0, 0, 0, 0, 1, 2, 0},
			    		{0, 0, 0, 0, 0, 0, 1, 0, 2}};
	
    private boolean[] visitadoAnchura = new boolean[9];
    private boolean[] visitadoProfundidad = new boolean[9];

    public int[][] getG()
    {
        return g;
    }
    
    public static void main(String[] args)
    {
        Grafo g=new Grafo();
        ArrayList<Integer> enAnchura=g.recorridoAnchura(0);//Nodo inicial 0
        System.out.println("Recorrido en anchura");
        for(int i=0;i<enAnchura.size();i++)
        {
            System.out.print(""+enAnchura.get(i)+" ");
        }
        ArrayList<Integer> enProfundidad=g.recorridoProfunidad(0);//Nodo inicial 0
        System.out.println("");
        System.out.println("Recorrido en profundidad");
        for(int i=0;i<enProfundidad.size();i++)
        {
            System.out.print(""+enProfundidad.get(i)+" ");
        }
    }

public ArrayList<Integer> recorridoAnchura(int nodoI)
{
    ArrayList<Integer> recorridos = new ArrayList<Integer>();
    visitadoAnchura[nodoI] = true;
    ArrayList<Integer> cola = new ArrayList<Integer>();
    recorridos.add(nodoI);
    cola.add(nodoI);
    while (!cola.isEmpty())
    {
    	int j = cola.remove(0);
        for (int i = 0; i < g.length; i++)
        {
        	if (g[j][i] == 1 && !visitadoAnchura[i])
        	{
        		cola.add(i);
        		recorridos.add(i);
                visitadoAnchura[i] = true;
        	}
        }
    }
    return recorridos;
}

    public ArrayList<Integer> recorridoProfunidad(int nodoI)
    {
        ArrayList<Integer> recorridos = new ArrayList<Integer>();
        visitadoProfundidad[nodoI] = true;
        ArrayList<Integer> cola = new ArrayList<Integer>();
        recorridos.add(nodoI);
        cola.add(nodoI);
        while (!cola.isEmpty())
        {
            int j = cola.remove(0);
            for (int i = 0; i < g.length; i++)
            {
                if (g[j][i] == 1 && !visitadoProfundidad[i])
                {
                    cola.add(i);
                    recorridos.addAll(recorridoProfunidad(i));
                    visitadoProfundidad[i] = true;
                }
            }
        }
        return recorridos;
    }
}