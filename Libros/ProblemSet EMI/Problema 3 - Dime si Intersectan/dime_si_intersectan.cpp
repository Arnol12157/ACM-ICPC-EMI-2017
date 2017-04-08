#include<cstdio>
#include<iostream>
#include<cstring>
#include<cmath>

using namespace std;

int main()
{
    freopen("intersectan.input", "r", stdin);
    freopen("output.txt", "w", stdout);
    int x1, y1, r1, x2, y2, r2;
    while(scanf("%d %d %d %d %d %d", &x1, &y1, &r1, &x2, &y2, &r2), (x1 || y1 || r1 || x2 || y2 || r2))
    {
        double dist = (double)sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
        double suma = r1 + r2;
        if((double)suma > dist)
        {
            printf("INTERSECTAN\n");
        }
        else
        {
            printf("NO INTERSECTAN\n");
        }

    }
    return 0;
}

