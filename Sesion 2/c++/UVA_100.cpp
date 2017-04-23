//The 3n+1 problem - UVA 100
//Author: Ted Carrasco Carrasco
#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    //freopen("prueba.input", "r", stdin);
    //freopen("prueba.output", "w", stdout);
    double a, b;
    while(scanf("%lf %lf", &a, &b) != EOF)
    {
        int maxi = max(a, b);
        int mini = min(a, b);
        int mayor = 0;
        for (size_t i = mini; i <= maxi; i++) {
            int n = i;
            int count = 1;
            while(n != 1)
            {
                if(n % 2 == 0)
                {
                    n = n / 2;
                }
                else
                {
                    n = (3 * n) + 1;
                }
                count++;
            }
            mayor = max(mayor, count);
        }
        cout<<a<<" "<<b<<" "<<mayor<<endl;
    }
}
