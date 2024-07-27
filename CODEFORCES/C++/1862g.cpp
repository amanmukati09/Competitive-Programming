
#include <bits/stdc++.h>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    int t;
    cin >> t;
    for (int i = 0; i < t; i++)
    {
        int n;
        cin >> n;
        vector<int> a(n);
        for (int j = 0; j < n; j++)
        {
            cin >> a[j];
        }
        multiset<int> st1;
        for (int j = 0; j < n; j++)
        {
            st1.insert(a[j]);
        }
        vector<int> a2 = a;
        sort(a2.begin(), a2.end());
        multiset<int> st2;
        st2.insert(0);
        for (int j = 0; j < n - 1; j++)
        {
            st2.insert(a2[j + 1] - a2[j]);
        }
        int q;
        cin >> q;
        for (int j = 0; j < q; j++)
        {
            int p, x;
            cin >> p >> x;
            p--;
            auto itr1 = st1.find(a[p]);
            if (itr1 != st1.begin())
            {
                st2.erase(st2.find(a[p] - *prev(itr1)));
            }
            if (next(itr1) != st1.end())
            {
                st2.erase(st2.find(*next(itr1) - a[p]));
            }
            if (itr1 != st1.begin() && next(itr1) != st1.end())
            {
                st2.insert(*next(itr1) - *prev(itr1));
            }
            st1.erase(itr1);
            a[p] = x;
            auto itr2 = st1.lower_bound(a[p]);
            if (itr2 != st1.begin())
            {
                st2.insert(a[p] - *prev(itr2));
            }
            if (itr2 != st1.end())
            {
                st2.insert(*itr2 - a[p]);
            }
            if (itr2 != st1.begin() && itr2 != st1.end())
            {
                st2.erase(st2.find(*itr2 - *prev(itr2)));
            }
            st1.insert(a[p]);
            cout << *prev(st1.end()) + *prev(st2.end());
            if (j < q - 1)
            {
                cout << ' ';
            }
        }
        cout << endl;
    }
}