#include <iostream>

using namespace std;

int main() {
    int b = 1, c1, c2;
    while (cin >> c1 >> c2) {
        if (c1 == b) b = c2;
        else if (c2 == b) b = c1;
    }
    cout << b << "\n";
}