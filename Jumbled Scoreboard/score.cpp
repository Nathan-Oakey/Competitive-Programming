#include <iostream>

using namespace std;

int main() {
    int n, h = 0, a = 0; cin >> n;
    bool c = true;
    for (int i = 0; i < n; i++) {
        int s, s1; cin >> s >> s1;
        if (s < h || s1 < a) c = false;
        h = s; a = s1;
    }
    c ? cout << "yes\n" : cout << "no\n";
}