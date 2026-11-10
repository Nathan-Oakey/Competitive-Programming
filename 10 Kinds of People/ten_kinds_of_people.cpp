#include <iostream>
#include <vector>
#include <queue>
using namespace std;

int main(int argc, char const *argv[])
{
    int r, c;
    cin >> r >> c;
    vector<string> grid(r);
    vector<vector<int>> comp(r, vector<int>(c, -1));
    for (int i = 0; i < r; i++) {
        cin >> grid[i];
    }
    
    int dr[] = {1, -1, 0, 0}, dc[] = {0, 0, -1, 1}, id = 0;
    
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            if (comp[i][j] != -1) {
                continue;
            }
            queue<pair<int,int>> q;
            q.push({i, j});
            comp[i][j] = id;

            while (!q.empty()) {
                auto cur = q.front();
                q.pop();
                int row = cur.first, col = cur.second;

                for (int k = 0; k < 4; k++) {
                    int nr = row + dr[k], nc = col + dc[k];
                    if (nr < 0 || nr >= r || nc < 0 || nc >= c) {continue;}
                    if (comp[nr][nc] != -1) {continue;}
                    if (grid[nr][nc] != grid[row][col]) {continue;}

                    comp[nr][nc] = id;
                    q.push({nr,nc});
                }
            }
            id++;
        }
        
    }

    int n;
    cin >> n;

    for (int i = 0; i < n; i++) {
        int r1, c1, r2, c2;
        cin >> r1 >> c1 >> r2>> c2;
        r1--; c1--; r2--; c2--;
        if (comp[r1][c1] == comp[r2][c2]) {
            if (grid[r1][c1] == '0') {cout << "binary" << endl;}
            else {cout << "decimal" << endl;}
        } else {cout << "neither" << endl;}
    }

    return 0;
}
