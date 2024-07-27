#include <bits/stdc++.h>

#define int long long

#define pcl(x) (__builtin_popcountll(x))

using namespace std;

const int N = 70, M = 1e5 + 7, mod = 998244353;

int T_T, n, m, i, lim, pw[N], b[M], ans;

struct node
{
    int f, g, p;
} f[N];

node dfs(int n)
{
    if (!n)
        return node{0, 0, 1};
    int d = log2(n);
    if (pcl(n + 1) == 1 && f[d].f > 0)
        return f[d];
    int ls, rs;
    if (n - (pw[d] - 1) <= pw[d - 1])
        rs = pw[d - 1] - 1, ls = n - 1 - rs;
    else
        ls = pw[d] - 1, rs = n - 1 - ls;
    node t1 = dfs(ls), t2 = dfs(rs), res;
    res.p = t1.p * t2.p % mod * m % mod;
    res.g = lim * (t1.g * t2.p % mod + t2.g * t1.p % mod + t1.p * t2.p % mod) % mod;
    res.f = (res.g + t1.g * t2.g % mod * lim % mod + t1.f * t2.p % mod * m + t2.f * t1.p % mod * m) % mod;
    if (pcl(n + 1) == 1)
        f[d] = res;
    return res;
}

signed main()
{
    for (pw[0] = 1, i = 1; i < 64; ++i)
        pw[i] = pw[i - 1] * 2;
    for (scanf("%lld", &T_T); T_T--;)
    {
        for (scanf("%lld%lld", &n, &m), lim = 1; lim <= m; ++lim)
            memset(f, 0, sizeof(f)), b[lim] = dfs(n).f;
        for (ans = 0, i = 1; i <= m; ++i)
            ans = (ans + (b[i] - b[i - 1] + mod) % mod * i % mod) % mod;
        printf("%lld\n", ans);
    }
}