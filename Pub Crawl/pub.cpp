#include <iostream>

using namespace std;

int main() {
    int n, m = 0, q = 0; string ms; cin >> n; 
    for (int i = 0; i < n; i++) {
        string s; int p, t; cin >> s >> p >> t;
        int a = p * t;
        if ((a + t) > m || (t > q && a == m)) {m = a + t; ms = s; q = t;}
    }
    cout << ms << " " << m << "\n";
}