#include<bits/stdc++.h>
using namespace std ; 
int main(){
	int a,b,c,flag = 0 ,i =  0    ; 
	cin>>a>>b>>c ; 
	if (a+b >c && a+c>b && b+c>a){
		flag = 1 ; 
	}
	if(!flag) cout<<"KHONGTG"; 
	if(a==b &&  a ==c && b == c) cout<<"DEU" ;
	else i++ ; 
	if(a==c || a==b || b == c) cout<<"CAN"; 
		else i++ ;
	if(a*a+b*b == c*c || a*a+c*c == b*b || b*b+c*c == a*a) cout<"VUONG"; 
		else i++ ;
	if(a*a+b*b == c*c || a*a+c*c == b*b || b*b+c*c == a*a &&(a==c || a==b || b == c) ) cout<<"VUONGCAN";
		else i++ ;
    if(i==4) cout<<"Thuong";
} 