#include <iostream>
#include <vector>

using namespace std;

int main() {
    int r, c; cin >> r >> c;
    vector<pair<int, int> > p;
    for (int i = 0; i < r; i++) {
        string s; cin >> s;
        for (int j = 0; j < c; j++) if (s[j] == '*') p.push_back({i + 1, j + 1});
    }
    cout << p.size() << "\n";
    for (auto m : p) cout << m.first << " " << m.second << "\n";
}
