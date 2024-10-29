
#include <iostream>
#include<stdexcept>
using namespace std;

double divide(double nume , double denomi){
    if(denomi==0){
        throw runtime_error("not allowed");
    }
    return nume/denomi;
}

class array{
    
    int* arr;
    int size;
    public:
    
    array(int s) : size(s) {
        arr = new int[size];
    }
    ~array() {
        delete[] arr;
    }
    
    void set(int idx , int value ){
        
        if(idx<0|| idx>=size){
            throw out_of_range("index out of bound");
        }
        
        arr[idx]=value;
    }
    
    int get(int idx){
         if(idx<0|| idx>=size){
            throw out_of_range("index out of bound");
        }
        return arr[idx];
    }
    
};
int main() {
    
    int num ;
    int denomi;
    cout<<"enter numerator and denominator"<<endl;
    cin>>num>>denomi;
    int x =  divide(num , denomi);
    cout<<"The value :"<<x<<endl;
   
    
    int k ;
    cout<<"enter the size of array";
    cin>>k;
    array arr(k);
    
    while(true){
        cout<<"choose an option"<<endl;
        cout<<" 1. get value :"<<endl;
        cout<<" 2. set value :"<<endl;
        int choice;
        cin>>choice;
        
        if(choice==1){
            cout<<"inter index and value do u want to enter";
            int idx;
            int val;
            cin>>idx>>val;
            try{
                arr.set(idx , val);
                cout<<"value set successfully"<<endl;
            }
            
            catch(const out_of_range & e){
                cout<<"error : "<<e.what()<<endl;
            }
        }
        else if(choice==2){
            cout<<"inter index  do u want to get";
            int idx;
            cin>>idx;
            try{
                arr.get(idx );
                cout<<"value get successfully"<<endl;
            }
            
            catch(const out_of_range & e){
                cout<<"error : "<<e.what()<<endl;
            }
        }
    }
    
    return 0;
}