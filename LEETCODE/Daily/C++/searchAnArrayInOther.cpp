// C++ program to demonstrate the use of std::search

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main()
{
    int i, j;

    vector<int> v1 = {1, 2, 3, 4, 5, 6, 7};

    vector<int> v2 = {3, 4, 5,7};// order wise present 

    vector<int>::iterator i1;

    i1 = std::search(v1.begin(), v1.end(), v2.begin(), v2.end());

    if (i1 != v1.end())
    {
        cout << "vector2 is present at index " << (i1 - v1.begin());
    }
    else
    {
        cout << "vector2 is not present in vector1";
    }

    return 0;
}
