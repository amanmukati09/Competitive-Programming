#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here

    int t;
    cin >> t;

    while (t--)
    {
        int a, b, c;
        cin >> a >> b >> c;

        if ((a == b) && (c >= a))
        {
            cout << "YES" << endl;
        }
        else if ((b == c) && (a >= c))
        {
            cout << "YES" << endl;
        }
        else if ((c == a) && (b >= a))
        {
            cout << "YES" << endl;
        }
        else
        {
            cout << "NO" << endl;
       
        }

        return 0;
    }
}
