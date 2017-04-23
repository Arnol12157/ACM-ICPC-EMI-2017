
//Searching for Nessy - UVA 11044
//Author: Ted Carrasco Carrasco
#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    // freopen("prueba.input", "r", stdin);
    // freopen("prueba.output", "w", stdout);
    int n;
    cin>>n;
    while (n--)
    {
        int a, b;
        cin>>a>>b;
        printf("%d\n", (  (a / 3 ) * ( b / 3 ) ) );
    }
}
