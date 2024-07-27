#include <bits/stdc++.h>

using namespace std;

int main()
{

    string s;
    cin >> s;

    int n = s.length();

    int dp[n];
    dp[0] = 1;

    for (int i = 1; i < n; i++)
    {
        if (s[i] == s[i - 1])
        {
            dp[i] = dp[i] + 1;
        }
        else
        {
            dp[i] = 1;
        }
    }

    bool flag = false;

    for (int i = 0; i < n; i++)
    {
        if (dp[i] >= 7)
        {
            flag = true;
            break;
        }
    }

    if (flag)
    {
        cout << "YES" << endl;
    }
    else
    {
        cout << "NO" << endl;
    }

    return 0;
}