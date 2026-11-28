#include <iostream>
using namespace std;
int main () {
    int n; cin >> n;
    bool p = true;
    long long t = 0;
    for (int i = 0; i < n; i++) {
        long long g, b; cin >> g >> b;
        t += g; 
        if (t < b) {
            cout << "impossible\n";
            p = false;
            break;
        }
    }
    if (p) cout << "possible\n";
}