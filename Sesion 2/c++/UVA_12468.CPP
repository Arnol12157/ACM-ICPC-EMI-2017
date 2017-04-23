
//Zapping- UVA 124568
//Author: Ted Carrasco Carrasco
#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    freopen("prueba.input", "r", stdin);
    freopen("prueba.output", "w", stdout);
    int a, b;
    while (scanf("%d %d", &a, &b))
    {

        if(a < 0)
          break;
        int ma, me, aa, bb;
        aa = max(a, b);
        bb = min(a, b);
        ma = aa - bb;
        me = (100 - aa) + bb;
        if(ma > me)
        {
            cout<<me<<endl;
        }
        else
        {
            cout<<ma<<endl;
        }
    }
}
