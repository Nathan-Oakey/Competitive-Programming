#include <iostream>
using namespace std;
int main() {
    int n; cin >> n;
    cout << n << ":\n";
    for (int i = 2; i <= (n + 1) / 2; i++) {
        if (n % (2 * i - 1) == 0 || (n - i) % (2 * i - 1) == 0) cout << i << "," << i - 1 << "\n";
        if (n % i == 0 && n / i >= 2) cout << i << "," << i << "\n";
    }
}