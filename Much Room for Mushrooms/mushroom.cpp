#include <iostream>
using namespace std;
int main() {
    int r, c; cin >> r >> c;
    if (c == 1) cout << 1 << "\n";
    else if (r == 1) cout << (c + 2) / 3 << "\n";
    else if (r == 2) cout << c / 2 + 1 << "\n";
    else cout << -1 << "\n";
}