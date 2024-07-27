#include <bits/stdc++.h>
#define fr(a, b) for (int I = a; I < b; I++)
#define fra(z) for (auto IT : z)
#define all(x) x.begin(), x.end()
#define rall(x) x.rbegin(), x.rend()

/* alias names */
#define ll long long int
#define pb push_back
#define Vi vector<int>

    /* compatative codeing */
#define FASTIO                        \
    ios_base::sync_with_stdio(false); \
    cin.tie(NULL);
#define testcase() ;              
    int T;         \
    cin >> T;      \
    fr(0, T)
#define IFE(con) cout << ((con) ? "YES\n" : "NO\n");

    / array ip / op /
#define inA(A, n)               \
    ;                           \
    for (int J = 0; J < n; J++) \
        cin >> A[J];
#define outA(A, n)              \
    ;                           \
    for (int J = 0; J < n; J++) \
        cout << A[J] << " ";
#define inAA(A, n, m)           \
    ;                           \
    for (int K = 0; K < n; K++) \
    {                           \
        inA(A[K], m);           \
    }
#define outAA(A, n, m)          \
    ;                           \
    for (int K = 0; K < n; K++) \
    {                           \
        outA(A[K], m);          \
        cout << endl;           \
    }

    / array operations /
#define maxA(a) *max_element(all(a))
#define minA(a) *min_element(all(a))
#define sumA(a) accumulate(all(a), 0)
#define countA(a, x) count(all(a), x)

    / maths operation /
#define PI 3.14159265
#define sumN(n) (n * (n + 1)) / 2

    / Misc /
#define riv(x) \
    int x;     \
    cin >> x;

    using namespace std;

int main()
{
    FASTIO

    return 0;
}
// cerr<<"\n[time:"<<(float)clock()/CLOCKS_PER_SEC<<"sec]";