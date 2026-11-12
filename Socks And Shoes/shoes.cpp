#include <iostream>
#include <array>

using namespace std;

int main() {
    int n; cin >> n;
    array<bool, 16> states{};
    states[0] = true;
    for (int i = 0; i < n; i++) {
        string s; cin >> s;
        array<bool, 16> nextStates{};
        for (int state = 0; state <16; state++) {
            if (states[state]) {
                bool ls = state & (1);
                bool lsh = state & (1 << 2);
                bool rs = state & (1 << 1);
                bool rsh = state & (1 << 3);
                if (s == "👟") {
                    if (lsh || ls) nextStates[state ^ (1 << 2)] = true;
                    if (rs || rsh) nextStates[state ^ (1 << 3)] = true;
                }
                else {
                    if (ls || !lsh) nextStates[state ^ (1)] = true;
                    if (rs || !rsh) nextStates[state ^ (1 << 1)] = true;
                }
            }
        }
        states = nextStates;
    }
    cout << (states[15] ? "gilt\n" : "ógilt\n");
}