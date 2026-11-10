#include <iostream>
#include <cmath>
using namespace std;
int main(int argc, char const *argv[])
{
    float r; 
    cin >> r;
    int num_infected = round(1 + r + (r * r) + (r * r * r));
    cout << num_infected << "\n";
    return 0;
}
