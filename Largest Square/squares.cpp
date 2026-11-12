#include <iostream>

using namespace std;

int main() {
    int n, max = 0; cin >> n;
    for (int i = 0; i < n; i++) {
        int a, b; cin >> a >> b;
        if (a == b) if (max < a) max = a;
    }
    cout << max << " " << max << "\n";
}