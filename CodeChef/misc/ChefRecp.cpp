#include <bits/stdc++.h>

#define ll long long
#define fast_io ios_base::sync_with_stdio(false);cin.tie(NULL)

using namespace std;

int main()
{
    fast_io;

    int t;
    cin >> t;

    while (t--)
    {

        int n;
        cin >> n;

        int arr[n];

        map<int, int> m;

        for (int i = 0; i < n; i++)
        {
            cin >> arr[i];
            m[arr[i]]++;
        }
        cout << "------ MAP ------\n";
        for(auto k : m){
            cout<<k.first << " " << k.second << endl;
        }
        cout << endl;

        set<int> v;
        for (auto x : m)
        {
            v.insert(x.second);
        }
        cout << endl;
        cout << "------SET : --------\n";
        for(auto p : v){
            cout << p << " ";
        }
        cout << endl;

        int ss = v.size();
        int mm = m.size();

        if (ss == mm)
        {
            cout << "YES" << endl;
        }
        else
        {
            cout << "NO" << endl;
        }
    }

    return 0;
}
