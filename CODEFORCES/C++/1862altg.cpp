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

        vector<int> a(n);
        for (int i = 0; i < n; i++)
        {
            cin >> a[i];
        }

        multiset<int> st1(a.begin(), a.end());
        vector<int> a2 = a;
        sort(a2.begin(), a2.end());
        multiset<int> st2;
        for (int i = 0; i < n - 1; i++)
        {
            st2.insert(a2[i + 1] - a2[i]);
        }

        int q;
        cin >> q;

        while (q--)
        {
            int p, x;
            cin >> p >> x;
            p--;

            int prev1 = *prev(st1.end());
            int prev2 = *prev(st2.end());

            int val = a[p];
            auto it1 = st1.find(val);
            st1.erase(it1);
            if (it1 != st1.begin())
            {
                st2.erase(st2.find(val - *prev(it1)));
            }
            if (next(it1) != st1.end())
            {
                st2.erase(st2.find(*next(it1) - val));
            }
            if (it1 != st1.begin() && next(it1) != st1.end())
            {
                st2.insert(*next(it1) - *prev(it1));
            }

            a[p] = x;
            st1.insert(x);
            auto it2 = st1.lower_bound(x);
            if (it2 != st1.begin())
            {
                st2.insert(x - *prev(it2));
            }
            if (it2 != st1.end())
            {
                st2.insert(*it2 - x);
            }
            if (it2 != st1.begin() && it2 != st1.end())
            {
                st2.erase(st2.find(*it2 - *prev(it2)));
            }

            cout << max(prev1 + *prev(st2.end()), prev2 + *prev(st1.end()));
            if (q > 0)
            {
                cout << ' ';
            }
        }

        cout << '\n';
    }

    return 0;
}
