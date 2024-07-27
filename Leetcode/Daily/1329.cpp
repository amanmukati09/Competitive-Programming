#include <bits/stdc++.h>
using namespace std;


    vector<vector<int>> ds(vector<vector<int>> &mat)
    {

        map<int, priority_queue<int, vector<int>, greater<int>>> mp;
        int m = mat.size();
        int n = mat[0].size();
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                mp[i - j].push(mat[i][j]);
            }
        }
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                mat[i][j] = mp[i - j].top();
                mp[i - j].pop();
            }
        }
        return mat;
}

int main(int argc, char ** argv) {

    vector<vector<int>> mat = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};


    vector<vector<int>> res = ds(mat);
    prints(res);



    return 0;}

