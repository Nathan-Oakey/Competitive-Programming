#include <iostream>
#include <cmath>
using namespace std;
int main(int argc, char const *argv[])
{
    int l, r;
    cin >> l >> r;
    double c = sqrt(2) * l;
    if (c <= 2 * r) {cout << "fits" << endl;}
    else {cout << "nope" << endl;}
    return 0;
}
