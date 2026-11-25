#include <iostream>
using namespace std;

int main() {
    int t; cin >> t;
    for (int i = 1; i <= t; i++) {
        int n, k; cin >> n >> k;
        int p = 1 << n;
        cout << "Case #" << i;
        (k % p == p - 1) ?  (cout << ": ON\n") : (cout << ": OFF\n");
    }
}