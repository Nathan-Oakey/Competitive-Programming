#include <iostream>

using namespace std;

int main() {
    int n; cin >> n;
    int f, s, t, d;
    for (int i = 0; i < n; i++) {
        cin >> d;
        if (i == 0) f = d / 3;
        else if (i == (n - 1)) t = d / 3;
        else if (i == 1) s = d;
    }
    cout << f << " " << s - (2 * f) << " " << t << "\n";
}
