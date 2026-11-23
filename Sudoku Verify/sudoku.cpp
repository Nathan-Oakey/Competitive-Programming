#include <iostream>
#include <vector>

using namespace std;

int main() {
    vector<vector<int> > s(9,vector<int>(9));
    bool r[9][9] = {false};
    bool c[9][9] = {false};
    bool b[9][9] = {false};
    for (int i = 0; i < 9; i++) for (int j = 0; j < 9; j++) cin >> s[i][j];
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            int n = s[i][j] - 1;
            int bi = (i / 3) * 3 + (j / 3);

            if (r[i][n] || c[j][n] || b[bi][n]) {
                cout << "INVALID!\n";
                return 0; 
            }

            r[i][n] = true;
            c[j][n] = true;
            b[bi][n] = true;
        }
    }
    cout << "VALID\n";
}