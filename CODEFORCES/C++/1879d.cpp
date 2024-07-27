#include <iostream>
#include <vector>
using namespace std;

const int MOD = 998244353;

int main()
{
    int n;
    cin >> n;
    vector<int> a(n);

    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }

    long long result = 0;
    vector<long long> prefix(n, 0);

    for (int i = 0; i < n; i++)
    {
        prefix[i] = a[i] ^ (i > 0 ? prefix[i - 1] : 0);
    }

    for (int l = 0; l < n; l++)
    {
        long long curr_xor = prefix[l];
        for (int r = l; r < n; r++)
        {
            curr_xor ^= a[r];
            result = (result + curr_xor * 1LL * (r - l + 1)) % MOD;
        }
    }

    cout << result << endl;

    return 0;
}
