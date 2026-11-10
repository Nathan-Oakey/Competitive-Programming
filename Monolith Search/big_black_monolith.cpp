#include <iostream>
#include <string>
#include <vector>
#include <numeric>
#include <algorithm>
using namespace std;

int main(int argc, char const *argv[])
{
    int h, w;
    cin >> h >> w;
    vector<string> grid(h);
    for (int i = 0; i < h; i++) {
        {cin >> grid[i];}
    }

    int numActual = 0;
    for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
            if (grid[i][j] == '#' && (i == 0 || grid[i - 1][j] == '.') && (j == 0 || grid[i][j - 1] == '.')) {
                bool possible = false;
                char curr = grid[i][j]; int curri = i, currj = j;
                int hei = 0, wid = 0;
                while (curri < h && grid[curri][j] == '#') {
                    hei++;
                    curri++;     
                }
                if (hei > 9) { break; }
                curr = grid[i][j];
                while (currj < w && grid[i][currj] == '#') {
                    wid++;
                    currj++;
                }
                if (wid > 9) { break; }
                if (hei > 9 || wid > 9) { break; }
                int first = min(hei, wid), second = max(hei, wid);
                if ((first == 1 && second == 4) || (first == 1 && second == 9) || (first == 4 && second == 9)) {
                    possible = true;
                }
                if (!possible) { continue; }
                bool finish = false;
                while (possible && !finish) {
                    int bi = i - 1;
                    if (bi >= 0) {
                        for (int bj = j - 1; bj <= j + wid; bj++) {
                            if (bj < 0 || bj >= w) { continue; }
                            if (grid[bi][bj] != '.') {
                                possible = false;
                                break;
                            }
                        }
                    }
                    if (!possible) { continue; }

                    bi = i + hei;
                    if (bi < h) { 
                        for (int bj = j - 1; bj <= j+ wid; bj++) {
                            if (bj < 0 || bj >= w) { continue; }
                            if (grid[bi][bj] != '.') {
                                possible = false;
                                break;
                            }
                        }       
                    }
                    if (!possible) { continue; }

                    int bj = j - 1; 
                    if (bj >= 0) { 
                        for (int bi = i - 1; bi <= i + hei; bi++) {
                            if (bi < 0 || bi >= h) { continue; }
                            if (grid[bi][bj] != '.') {
                                possible = false;
                                break;
                            }
                        }
                    }
                    if (!possible) { continue; }

                    bj = j + wid;
                    if (bj < w) {
                        for (int bi = i - 1; bi <= i + hei; bi++) {
                            if (bi < 0 || bi >= h)  { continue; }
                            if (grid[bi][bj] != '.') {
                                possible = false;
                                break;
                            }
                        }
                    }
                    if (!possible) { continue; }
                    finish = true;
                }
                finish = false;

                while (possible && !finish) {
                    for (int ii = 0; ii < hei; ii++) {
                        for (int ij = 0; ij < wid; ij++) {
                            if (grid[i + ii][j + ij] != '#') {
                                possible = false;
                                break;
                            }
                        }
                        if (!possible) {
                            break;
                        }
                    }
                    finish = true;
                }
                
                if (possible) { numActual++; }
            }
        }
    }

    if (numActual == 1) {
        cout << "Steinn fannst" << "\n";
    } else if (numActual == 0) {
        cout << "Ekkert fannst" << "\n";
    } else {
        cout << "Bilun" << "\n";
    }

    return 0;
}
