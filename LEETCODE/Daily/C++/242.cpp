#include <bits/stdc++.h>
using namespace std;

bool isAnagram(string s, string t)
{
    sort(s.begin(), s.end());
    sort(t.begin(), t.end());
    
    return s == t;
}
bool isAnagram(string s, string t)
{

    if (s.length() != t.length())
        return false;
    int n = s.length();

    unordered_map<char, int> counts;

    for (int i = 0; i < n; i++)
    {

        counts[s[i]]++;
        counts[t[i]]--;
        // the above 2 will only check for matching indrectly for result
    }

    for (auto count : counts)
        if (count.second)
            return false; // if any char's freq is > 0 false t
    return true;
}

int main(int argc, char ** argv) {








   return 0;}