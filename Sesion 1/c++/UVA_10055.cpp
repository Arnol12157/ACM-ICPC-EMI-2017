//Hashmat the Brave Warrior - UVA 10055
//Author: Ted Carrasco Carrasco
#include <iostream>
#include <cstdio>
using namespace std;

int main()
{
    //freopen("prueba.input", "r", stdin);
    //freopen("prueba.output", "w", stdout);
    long long int a, b;
    while(scanf("%lld %lld", &a, &b) != EOF)
    {
        if(a > b)
        {
            cout<<a-b<<endl;
        }
        else
        {
            cout<<b-a<<endl;
        }
    }
}
