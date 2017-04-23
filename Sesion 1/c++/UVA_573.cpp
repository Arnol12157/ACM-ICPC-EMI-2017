//The Snail- UVA 573
//Author: Ted Carrasco Carrasco
#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    //freopen("prueba.input", "r", stdin);
    //freopen("prueba.output", "w", stdout);
    int h, u, d, f;
    while(scanf("%d %d %d %d", &h, &u, &d, &f) , (h || u || d || f))
    {
        int day = 1;
        bool flag = 0;
        float i_h = 0, d_c = 0, h_ac = 0, h_as = 0;
        float per = u * ((float)f / 100);
        d_c = (float)u;
        while(1)
        {
            h_ac = h_ac + d_c;
            //cout<<day<<" - "<<d_c<<" - "<<h_ac<<endl;
            if(h_ac > h)
            {
                flag = 1;
                break;
            }
            if(h_ac < 0)
            {
                flag = 0;
                break;
            }
            h_as = h_ac - d;
            if(h_as < 0)
            {
                flag = 0;
                break;
            }
            d_c = d_c - per;
            if(d_c < 0)
            {
                d_c = 0;
            }
            day++;
            h_ac = h_as;
        }
        if(flag)
        {
            cout<<"success on day "<<day<<endl;
        }
        else
        {
            cout<<"failure on day "<<day<<endl;
        }

    }
}
