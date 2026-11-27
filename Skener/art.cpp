#include <iostream>
#include <vector>
using namespace std;
int main() {
    int r, c, zr, zc; cin >> r >> c >> zr >> zc; 
    vector<string> a(r);
    for (int i = 0; i < r; i++) cin >> a[i];
    vector<vector<char> > o(r * zr, vector<char> (c * zc));
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            char l = a[i][j];
            for (int k = i * zr; k < (i + 1) * zr; k++) for (int m = j * zc; m < (j + 1) * zc; m++) o[k][m] = l;
        }
    }
    for (int i = 0; i < r * zr; i++) {
        for (int j = 0; j < c * zc; j++) {
            cout << o[i][j];
        }
        cout << '\n';
    }
}