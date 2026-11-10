#include <iostream>
#include <vector>

using namespace std;

int main(int argc, char const *argv[])
{
    int r, c; cin >> r >> c;
    vector<string> v(r);
    int toSearchx[] = {-1, 0, 1, -1, 1, -1, 0, 1};
    int toSearchy[] = {-1, -1, -1, 0, 0, 1, 1, 1};
    for (int i = 0; i < r; i++) {
        cin >> v[i];
    }
    int l = 0; pair<int, int> coords;
    for (int i = 1; i < r - 1; i++) {
        for (int j = 1; j < c - 1; j++) {
            if (v[i][j] == '0') {
                int k = 0;
                while (k < 8 && v[i + toSearchx[k]][j + toSearchy[k]] == 'O') k++;
                if (k == 8) {l++; coords = {i + 1, j + 1};}
            } 
        }
    }
    if (l == 0) cout << "Oh no!" << "\n";
    else if (l == 1) cout << coords.first << " " << coords.second << "\n";
    else cout << "Oh no! " << l << " locations" << "\n";
    return 0;
}
