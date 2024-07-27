#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin >> t;

    while (t--)
    {
        int n;
        cin >> n;

        vector<int> s;
        int arr[n];

        for (int i = 0; i < n; i++)
        {
            cin >> arr[i];
            s.push_back(arr[i]);
        }

        sort(s.begin(), s.end());
        s.erase(unique(s.begin(), s.end()), s.end());

        vector<int> cou;


        for (int i = 0; i < n; i++)
        {
            int c = count(arr, arr + n, s[i]);
            cou.push_back(c);
        }

        sort(cou.begin(), cou.end());
        cou.erase(unique(cou.begin(), cou.end()), cou.end());

        int ss = cou.size();
        if(ss%2 == 0){
            
        }
    }


    return 0;
}