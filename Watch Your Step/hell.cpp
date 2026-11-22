#include <iostream> 
#include <vector>
#include <algorithm>

using namespace std;

vector<int> add(vector<int> a, vector<int> b) {
    vector<int> result;
    int carry = 0;

    for (int i = 0; i < max(a.size(), b.size()) || carry; i++) {
        int sum = carry;

        if (i < a.size()) sum += a[i];
        if (i < b.size()) sum += b[i];

        result.push_back(sum % 10);
        carry = sum / 10;
    }

    return result;
}

void print(vector<int> a) {
    for (int i = a.size() - 1; i >= 0; i--) {
        cout << a[i];
    }
    cout << '\n';
}

int main() {
    int xi, yi, xf, yf;
    int x1, y1, x2, y2;

    cin >> xi >> yi >> xf >> yf;
    cin >> x1 >> y1 >> x2 >> y2;

    vector<int> dp[129][129];
    bool blocked[129][129] = {};

    blocked[x1][y1] = true;
    blocked[x2][y2] = true;

    dp[xi][yi] = {1};

    for (int x = xi; x <= xf; x++) {
        for (int y = yi; y <= yf; y++) {

            if (blocked[x][y]) {
                dp[x][y] = {0};
                continue;
            }

            if (x == xi && y == yi) continue;

            vector<int> left = {0};
            vector<int> below = {0};

            if (x > xi)
                left = dp[x - 1][y];

            if (y > yi)
                below = dp[x][y - 1];

            dp[x][y] = add(left, below);
        }
    }

    print(dp[xf][yf]);
}