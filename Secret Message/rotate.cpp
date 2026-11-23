#include <iostream>
#include <vector>
#include<cmath>
#include <algorithm>

using namespace std;

int main() {
    int c; cin >> c;
    for (int i = 0; i < c; i++) {
        string m; cin >> m;
        int n = ceil(sqrt(m.size()));
        vector<vector<char> > s(n, vector<char>(n, '*'));
        for (int i = 0; i < m.size(); i++) s[i / n][i % n] = m[i];
        for (int i = 0; i < n; i++) for (int j = i + 1; j < n; j++) swap(s[i][j], s[j][i]);
        for (int i = 0; i < n; i++) reverse(s[i].begin(), s[i].end());
        string t = "";
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) if (s[i][j] != '*') t += s[i][j];
        cout << t << "\n";
    }
}
