#include <iostream>
#include <vector>

using namespace std;

int main() {
    int p = 0, o = 0, n, k; cin >> n >> k;
    int u = 2 * n - k;

    vector<int> f(n + 1, 0);
    for (int i = 0; i < k; i++) {
        int x; cin >> x; 
        f[x]++;
    }
    for (int i = 0; i <= n; i++) {
        if (f[i] == 2) p++; 
        else if (f[i] == 1) o++;
    }

    if (u == 1 || (u == 2 && o == 0)) p++;

    cout << p << "\n";
}