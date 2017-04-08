/*
    Autor: Jose Machicado
    Problema: Decode the tape - 10878
    Estado: Aceptado
    Tiempo ejecucion: 0.008
    Descripcion: manejo de caracteres y codigo ASCII
*/

#include <cstring>
#include <algorithm>
#include <vector>
#include <iostream>
#include <sstream>
#include <cstdio>
#include<map>
#include<math.h>
#include<stack>
using namespace std;
void find_and_replace(string &source, const string find, string replace);
int main()
{
    //freopen("decode.input", "r", stdin);
    //freopen("output2.txt", "w", stdout);
	string entrada;
	int res;
	char *aux;
	getline(cin,entrada);
	while(true)
	{
		getline(cin,entrada);
		if(entrada.compare("___________")==0)
			break;
		entrada.erase(0,1);
		entrada.erase(5,1);
		entrada.erase(8,1);
		find_and_replace(entrada," ","0");
		find_and_replace(entrada,"o","1");
		res=strtol(entrada.c_str(),&aux,2);
		printf("%c",res);
	}
	return 0;
}
void find_and_replace(string &source, const string find, string replace)
{
	size_t j;
	for ( ; (j = source.find( find )) != string::npos ; ) {
		source.replace( j, find.length(), replace );
	}
}
