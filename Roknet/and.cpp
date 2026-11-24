#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
    int n; cin >> n;
    unordered_map<string, bool> v;
    for (int i = 0; i < n; i++) {
        string s; cin >> s;
        if (s == "INNTAK") {
            string c, a; cin >> c >> a;
            v[c] = (a == "SATT");
        }
        else if (s == "OG") {
            string a, b, c; cin >> a >> b >> c;
            v[c] = v[a] && v[b];
        }
        else if (s == "EDA") {
            string a, b, c; cin >> a >> b >> c;
            v[c] = v[a] || v[b];
        }
        else if (s == "EKKI") {
            string a, c; cin >> a >> c;
            v[c] = !v[a];
        }
        else {
            string a; cin >> a;
            cout << a << " " << (v[a] ? "SATT" : "OSATT") << "\n";
        }
    }
}