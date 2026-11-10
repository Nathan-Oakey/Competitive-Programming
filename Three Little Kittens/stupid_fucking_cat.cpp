#include <iostream>
#include <string>
#include <vector>
using namespace std;
int main(int argc, char const *argv[])
{
    int x, y;
    cin >> x >> y;
    vector<string> yard(x + 2, string(y + 2, '.'));
    for (int i = 1; i <= x; i++) {
        string row;
        cin >> row;
        yard[i] = '.' + row + '.';
    }
    vector<int> d1 = {-1, 0, 1, -1, 1, -1, 0, 1}, d2 = {1, 1, 1, 0, 0, -1, -1, -1};
    vector<pair<int, int>> rCoords(3), bCoords(3), gCoords(3);
    bool rM = false, bM = false, gM = false, r = false, b = false, g = false;
    for (int i = 1; i <= x; i++){
        for (int j = 1; j <= y; j++) {
            char curr = yard[i][j];
            if (curr == 'W') {continue;}
            if (curr == '.') {continue;}
            else {
                int numSame = 0;
                for (int k = 0; k < 8; k++) {
                    char next = yard[i + d1[k]][j + d2[k]];
                    if (next == '.') {continue;}
                    if (numSame == 2) {break;}
                    if (next == curr && curr == 'R') { // red
                        numSame++;
                        if (!r) {
                            r = !r;
                            rCoords[0] = {i, j};
                        }
                    } 
                    else if (next == curr && curr == 'B') { // blue
                        numSame++;
                        if (!b) {
                            b = !b;
                            bCoords[0] = {i, j};
                        }
                    }
                    else if (next == curr && curr == 'G') { // green
                        numSame++;
                        if (!g) {
                            g = !g;
                            gCoords[0] = {i, j};
                        }
                    }
                }
                if (numSame == 1) {
                    if (curr == 'R' && !rM) {
                        rM = !rM;
                        rCoords[1] = {i, j};
                    } else if (curr == 'R' && rM) {
                        rCoords[2] = {i, j};
                    } else if (curr == 'B' && !bM) {
                        bM = !bM;
                        bCoords[1] = {i, j};
                    } else if (curr == 'B' && bM) {
                        bCoords[2] = {i, j};
                    } else if (curr == 'G' && !gM) {
                        gM = !gM;
                        gCoords[1] = {i, j};
                    } else {
                        gCoords[2] = {i, j};
                    }
                }
            }
            
        }
    }
    cout << rCoords[0].first << " " << rCoords[0].second << " "
        << rCoords[1].first << " " << rCoords[1].second << " "
        << rCoords[2].first << " " << rCoords[2].second << "\n";
    cout << gCoords[0].first << " " << gCoords[0].second << " "
        << gCoords[1].first << " " << gCoords[1].second << " "
        << gCoords[2].first << " " << gCoords[2].second << "\n";
    cout << bCoords[0].first << " " << bCoords[0].second << " "
        << bCoords[1].first << " " << bCoords[1].second << " "
        << bCoords[2].first << " " << bCoords[2].second << "\n";

        
    return 0;
}
