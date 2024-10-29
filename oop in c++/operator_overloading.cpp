
#include <iostream>
using namespace std;

class complex{
    
    int real;
    int img;
    
    public:
    
    complex(int real , int img){
        this->real=real;
        this->img=img;
        
    };
    
    complex (){
        
    };
    
    void display(){
        cout<<real<<" + i"<<img<<endl;
    }
    
    complex operator + (complex & c){
        complex ans;
        ans.real = real+c.real;
        ans.img = img+c.img;
        return ans;
        
    }
    complex operator - (complex & c){
        complex ans;
        ans.real = real-c.real;
        ans.img = img-c.img;
        return ans;
        
    }
    complex operator * (complex & c){
        complex ans;
        ans.real = real*c.real;
        ans.img = img*c.img;
        return ans;
        
    }
};
int main() {
    int x , y , m , n;
    cout<<"enter the c1 (x , y) :"<<endl;
    cin>>x>>y;
    complex c1(x ,y);
    cout<<"enter the c2 (M , N ):"<<endl;
    cin>>m>>n;
    complex c2(m ,n);

    // sum
    complex sum = c1+c2;
    cout << "Sum: ";
    sum.display();

    //Difference
    complex Difference = c1-c2;
    cout << "Difference: ";
    Difference.display();

    //Product
    complex Product = c1*c2;
    cout << "product: ";
    Product.display();

    return 0;
}