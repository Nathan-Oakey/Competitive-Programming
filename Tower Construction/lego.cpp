#include <iostream>
using namespace std;

int main() {
    int n; cin >> n;
    int c, a = 1; cin >> c;
    for (int i = 0; i < n - 1; i++) {
        int b; cin >> b;
        if (b > c) a++;
        c = b;
    }
    cout << a << "\n";
}