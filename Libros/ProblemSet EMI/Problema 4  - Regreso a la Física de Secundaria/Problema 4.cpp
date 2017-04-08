#include <iostream>
#include <cstdio>
#include <stdio.h>
#include <string.h>
using namespace std;

int main()
{
    freopen("Problema4.input", "r", stdin);
    freopen("output.txt", "w", stdout);

    long Vo, t;
    while(scanf("%ld %ld", &Vo, &t) != EOF)
    {
        printf("%ld\n", 2 * Vo * t);
    }
    fclose (stdout);

}

