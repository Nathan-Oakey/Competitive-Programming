#include <iostream>

using namespace std;

int main() {
    int n; cin >> n;
    for (int i = 0; i < n; i++) {
        int shift; string s; cin >> shift;
        cin.ignore();
        getline(cin, s);
        string ds = "";
        for (char c : s) {
            char decrypt = c;
            if (c >= 'A' && c <= 'Z') {
                decrypt -= shift;
                if (decrypt < 'A') {
                    decrypt += 26;
                }
            } 
            else if (c >= 'a' && c <= 'z') {
                decrypt -= shift;
                if (decrypt < 'a') { 
                    decrypt += 26;
                }
            }
            ds += decrypt;
        }
        cout << ds << "\n";
    }
}
