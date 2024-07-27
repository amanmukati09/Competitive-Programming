#include <bits/stdc++.h>
using namespace std;

int main()
{

    int t;
    cin >> t;

    while (t--)
    {

        int N, n;

        cin >> N >> n;

        string yes = "YES";
        string no = "NO";

        if (n < 4)
        {
            cout << no << endl;
        }

        vector<string> s(N);

        for (int i = 0; i < N; ++i)
        {
            cin >> s[i];
        }

        vector<string> s0;

        for (int j = 0; j < n; j++)
        {

            string x = "";
            for (int k = 0; k < N; k++)
            {
                x += s[k][j];
            }

            s0.push_back(x);

        }

        string vika = "vika";
        int vk = 0;
        bool flag = false;

        for (int l = 0; l < s0.size(); l++)
        {

            if (s0[l].find(vika[vk]) != string::npos)
            {
                vk++;
                if (vk == 4)
                {
                    flag = true;
                    break;
                }
            }

        } // final loop

        if (flag)
        {
            cout << yes << endl;
        }
        else
        {
            cout << no << endl;
        }

    } // test case loop

    return 0;
}