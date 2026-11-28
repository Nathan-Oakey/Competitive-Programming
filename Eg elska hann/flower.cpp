#include <iostream>
using namespace std;
int main() {
    int n; cin >> n;
    int p = 1;
    while (p * 2 <= n) p *= 2;
    cout << 2 * (n - p) + 1 << "\n";
}