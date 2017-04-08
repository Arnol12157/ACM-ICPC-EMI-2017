#include<cstdio>
#include<iostream>
#include<cstring>
#include<climits>

using namespace std;

int main()
{
    freopen("granja.input", "r", stdin);
    freopen("output.txt", "w", stdout);
    long long a, b;
    while(scanf("%llu %llu", &a, &b), (a || b))
    {
        long long vaca, gall;
        vaca = b / 2 - a;
        gall = (b / 2) - (2 * vaca);
        if((b & 1 == 1) || vaca < 0 || gall < 0)
        {
            printf("-1\n");
        }
        else
        {
            printf("%llu %llu\n", gall, vaca);
        }
    }
    return 0;
}

