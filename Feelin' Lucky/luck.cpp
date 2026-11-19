#include <iostream>
#include <vector>

using namespace std;

int main() {
    vector<string> r(4);
    for (int i = 0; i < 4; i++) {cin >> r[i];}
    bool d[16] = {};
    d[0] = true;
    int b[] = {1, 2, 4, 8};
    char l[] = {'I', 'C', 'P', 'C'};
    for (string s : r) {
        bool n[16] = {};
        for (int m = 0; m < 16; m++) {
            if (!d[m]) continue;
            n[m] = true;
            for (int i = 0; i < 4; i++) if (!(m & b[i]) && s.find(l[i]) != string::npos) n[m | b[i]] = true;
        }
        for (int i = 0; i < 16; i++) d[i] = n[i];
    }
    cout << (d[15] ? 1 : 0) << "\n";
}