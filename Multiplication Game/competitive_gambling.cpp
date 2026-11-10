#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    double n;
    while (cin >> n) {
        double lim = 1;
        bool stan = true;
        while (lim < n) {
            if (stan) {lim *= 9;}
            else {lim *= 2;}
            stan = !stan;
        }       
        if (!stan) {cout << "Stan wins." << endl;} 
        else {cout << "Ollie wins." << endl;}
    }
    return 0;
}
