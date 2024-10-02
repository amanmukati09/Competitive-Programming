#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
    string F(string w)
    {

        unordered_map<char, int> m;

        for (char c : w)
        { // abb is pattern and mee is our word;

            // initially map is empty ; size == 0;

            if (!m.count(c))
            { // let pattern :'a' not in m so add it ;

                m[c] = m.size(); // m'a':0 similary b:1 and as there is a b so 2nd b not //counted here
                                 // map {'a':0, 'b':1};
                // 'm':0 and 'e':1 similary
            }
        }

        for (int i = 0; i < w.length(); ++i)
        {

            w[i] = 'a' + m[w[i]]; // now  w[0] = 'a'+0;and 'a'+1 in our array list ;
            // for m and e same m==0 so w[0] = 'a'+0 and w[1]= 'a'+1 and our p and w matches

            // check for another pattern abbbc it will work a+0 a+1 a+2  and meeec
        }

        return w;
    }

    vector<string> findAndReplacePattern(vector<string> &words, string p)
    {

        vector<string> res;

        for (string w : words)
        {

            if (F(w) == F(p))
            { // if w matches pattern insert w in new dynamic array;

                res.push_back(w);
            }
        }
        return res;
    }
};

int main(int argc, char ** argv) {




    return 0;}

v

