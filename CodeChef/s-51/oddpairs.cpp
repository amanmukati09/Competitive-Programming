#include<bits/stdc++.h>

using namespace std;


int main(){

int t;
cin>>t;

while(t--){

int n;
cin>>n;


if(n==1){
    cout<<0<<endl;
}
else if(n%2 == 0){
    cout<< (n*n)/2 <<endl;
}
else{
    
    cout<< (n-1)*(n+1) / 2<<endl;
    
}

}

return 0;
}