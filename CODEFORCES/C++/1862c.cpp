#include <bits/stdc++.h>
using namespace std;
int a, b, t;
void solve()
{
    cin >> a >> b;
    for (int i = a; i <= b; i++)
    {
        for (int j = 2; j <= i / j; j++)
        {
            if (i % j == 0)
            {
                cout << j << " " << i - j << endl;
                return;
            }
        }
    }
    cout << "-1" << endl;
}
int main()
{
    cin >> t;
    while (t--)
    {
        solve();
    }
}