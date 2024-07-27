#include <bits/stdc++.h>
using namespace std;


    string shiftingLetters(string s, vector<vector<int>> &shifts)
    {

        string op = s;

        for (auto &st : shifts)
        {

          if(st[2]>0){
              for (int i = st[0]; i <= st[1]; i++)
            {

                op.at(i) = op.at(i) + 1;
            }

          }
          else{

              for (int i = st[0]; i <= st[1]; i++)
              {

                  op.at(i) = op.at(i) - 1;
              }
          }
        }

        return op;
    }




    int main(int argc, char **argv)
{

    string s = "dztz";

    vector<vector<int>> v1 = {{0,0,0},{1,1,1}};

    cout << shiftingLetters(s, v1);

    return 0;
}