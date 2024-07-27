#include<bits/stdc++.h>
using namespace std;

vector<int> display(int a[], int n)
{

    vector<int> v;
    for (int i = 0; i < n; i++)
    {
        v.push_back(a[i]);
    }

    return v;
}

vector<vector<int>> perm(int a[], int n)
{
    vector<vector<int>> v;
    sort(a, a + n);

    do{
       v.push_back(display(a, n));
    } while (next_permutation(a, a + n));

    return v;
}

vector<float> findTriplets(vector<int> arr, int n)
{
    vector<float> sums;
    for (int i = 0; i < n - 2; i++)
    {
        for (int j = i + 1; j < n - 1; j++)
        {
            for (int k = j + 1; k < n; k++)
            {

                float  sum = (arr[i] + arr[j] + arr[k])/3.00;
                sums.push_back(sum);

            }
        }
    }

    return sums; // 



}

int main(){

    int a[] = {1, 2, 3, 4};
    int n = 4;

    vector<vector<int>> v = perm(a,n);
// 123 234 
// 123 234 345 514 152

    float res = 0.0;

    vector<float> sums;

    float res = 0.0;

    for (auto x : v)
    {


// 4 3 2 1  == x
sums = findTriplets(x, 4);// sums is an list having avg of all triplets 


}
   



    return 0;
}