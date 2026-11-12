#include <iostream>

using namespace std;

int main () {
    int n, m; cin >> n >> m;
    int x; cin >> x; int s = x, l = x;
    for (int i = 1; i < n; i++) {
        cin >> x;
        if (x < s) s = x;
        if (x > l) l = x;
    }
    (l - s <= 1) ? cout << "da komrad\n" : cout << "ósvífinn kapítalisti";
}