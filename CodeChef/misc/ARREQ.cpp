#include <bits/stdc++.h>
using namespace std;

#define ll long long

bool cmp(pair<string, int> &a,
         pair<string, int> &b)
{
    return a.second < b.second;
}


    int main()
    {


        ll arr[] = {1,1,1,2,2,2,3,4,5,6};
        map<int, int> mp;

        int n = sizeof(arr)/sizeof(arr[0]);
        
        for (ll i = 0; i < n; i++){
            mp[arr[i]]++;
        }

        vector<pair<int,int>> A;

      
        for (auto &it : mp)
        {
            A.push_back(it);
        }

        sort(A.begin(), A.end(), cmp);


        for(auto it = A.begin();A != A.end();it++){
            cout<<it.first<< "  "<<it.second<<endl;
        }

 




        return 0;
    }

