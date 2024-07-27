#include <bits/stdc++.h>
using namespace std;

int main(int argc, char **argv)

{

    int n;
    cin >> n;

    int v[n];
    int sum = 0;

    for (int i = 0; i < n; i++)
    {
        cin >> v[i];
        sum += v[i];
    }

    sort(v, v + n);

    int ls = 0;
    int cnt = 0;

    for (int i = n - 1; i >= 0; i--)
    {
        ls += v[i];
        cnt++;
        if (ls > (sum - ls))
        {
            break;
        }
    }

    cout << cnt << endl;

    return 0;
}