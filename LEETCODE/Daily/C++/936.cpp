#include <bits/stdc++.h>
using namespace std;





void removeDuplicates(int arr[], int n){
vector<int> v(arr, arr + n);
vector<int>::iterator it;
it = unique(v.begin(), v.end());
v.resize(distance(v.begin(), it));

for (auto it = v.begin(); it != v.end(); it++){

    cout << *it <<" "<< endl;
}


}


int main(int argc, char ** argv) {

    int arr[] = {1, 2, 3, 4, 5, 6, 7, 7, 7, 8, 8, 2, 1, 2};
    int n = sizeof(arr) / sizeof(arr[0]);

    removeDuplicates(arr, n);

    return 0;}