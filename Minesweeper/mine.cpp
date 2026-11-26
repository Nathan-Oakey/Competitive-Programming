#include <iostream>
#include <vector>

using namespace std;

int main() {
    int r, c, m; cin >> r >> c >> m;
    vector<vector<char> > v(r, vector<char>(c, '.'));
    for (int i = 0; i < m; i++) {
        int mr, mc; cin >> mr >> mc;
        v[mr - 1][mc - 1] = '*';
    }
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) cout << v[i][j];
        cout << "\n";
    }
}