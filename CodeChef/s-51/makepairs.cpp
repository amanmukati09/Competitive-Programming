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

        int a[n];
        int b[n];

        for (int i = 0; i < n; i++)
        {
            cin >> a[i];
        }

        for (int j = 0; j < n; j++)
        {
            cin >> b[j];
        }

        int sum = 1;

        for (int i = 0; i < n; i++)
        {
            sum = sum * (b[i] - a[i]);
        }

        cout << sum << endl;
    }

    return 0;
}