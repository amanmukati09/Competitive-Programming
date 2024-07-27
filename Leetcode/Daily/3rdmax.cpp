#include <bits/stdc++.h>
using namespace std;


int main(int argc, char ** argv) {

    vector<int> nums{ 3,3,4,3,4,3,0,3,3};
    int n = nums.size();


// 0 3 4


    sort(nums.begin(), nums.end());
    nums.erase(unique(nums.begin(), nums.end()), nums.end());

    n = nums.size();


    if (n <= 2)
    {
        cout<< nums[n - 1]<<endl;
    }

    int mx3 = nums[n - 3];


    cout<< mx3<<endl;


    return 0;}