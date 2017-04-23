//Laser Sculpture - UVA 11683
//Author: Ted Carrasco Carrasco
#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    freopen("prueba.input", "r", stdin);
    freopen("prueba.output", "w", stdout);
    int a, c;
    while(scanf("%d %d", &a, &c) , (a || c))
    {
        int A[c], cont = 0, actual;
        for (size_t i = 0; i < c; i++) {
            cin>>A[i];
        }
        for (size_t i = 0; i < c; i++) {
            if(i == 0)
            {
                cont = a - A[i];
            }
            else
            {
                if(A[i] < actual)
                {
                    cont = cont + (actual - A[i]);
                }
            }
            actual = A[i];
        }
        cout<<cont<<endl;
        // for (size_t i = 0; i < a; i++) {
        //     for (size_t j = 0; j < c; j++) {
        //         cout<<A[i][j]<<" ";
        //     }
        //     cout<<endl;
        // }
    }
}
