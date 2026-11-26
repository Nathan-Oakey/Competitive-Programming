#include <iostream>
#include <set>
#include <iomanip>
using namespace std;
int main() {
    int n; double w = 0; cin >> n;
    multiset<int> v;
    long long s = 0;
    for (int i = 0; i < n; i++) {
        char c; int a; cin >> c >> a;
        if (c == 'A') {
            w++; s += a;
            v.insert(a);
        } else {
            w--; s -= a;
            auto i = v.find(a);
            v.erase(i);
        }
        if (!v.empty()) {
            cout << *v.begin() << " " << *v.rbegin() << " " << fixed << setprecision(6) << s / w << "\n";
        } else {
            cout << "-1 -1 -1\n";
        }
    }
}