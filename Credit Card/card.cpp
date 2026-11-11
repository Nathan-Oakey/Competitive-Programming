#include <iostream>

using namespace std;

int main() {
    int p; cin >> p;
    int toSpend;
    if (p <= 500) toSpend = 500;
    else if (p <= 1000) toSpend = 1000;
    else if (p <= 2000) toSpend = 2000;
    else if (p <= 5250) toSpend = 5000;
    else if (p <= 11000) toSpend = 10000;
    else if (p <= 24000) toSpend = 20000;
    cout << toSpend << "\n";
}