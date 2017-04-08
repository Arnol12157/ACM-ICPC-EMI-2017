#include<cstdio>
#include<iostream>
#include<cstring>
#include<vector>
#include<algorithm>
using namespace std;
bool compare(const pair<string,int>&i, const pair<string,int>&j)
{
    return i.second > j.second;
}
int main()
{
    freopen("google.input", "r", stdin);
    freopen("output.txt", "w", stdout);
    int n, d=0;
    cin>>n;
    while(n--)
    {
        vector<pair<string, int> > urls(11);
        for(int i = 0; i < 10; i++)
            cin>>urls[i].first>>urls[i].second;
        urls[10].first = "e";
        urls[10].second = -7987987;
        sort(urls.begin(), urls.end(), compare);
        printf("Case #%d:\n", ++d);
        for(int i = 0; i < 10; i++)
        {
            if(urls[i].second == urls[0].second)
            {
                cout<<urls[i].first<<endl;
            }
        }
    }
    fclose (stdout);
    return 0;
}
