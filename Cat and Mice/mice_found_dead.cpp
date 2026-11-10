#include <iostream>
#include <iomanip>
#include <cmath>
#include <vector>
using namespace std;

struct Mouse {double x, y, t;};
bool can(double v0, const vector<Mouse>& mice, const vector<double>& startDist, const vector<vector<double>>& dist, double m);

int main(int argc, char const *argv[])
{
    int n; double m;
    cin >> n;
    
    vector<Mouse> mice(n);
    for (int i = 0; i < n; i++) {cin >> mice[i].x >> mice[i].y >> mice[i].t;}
    cin >> m;
    vector<double> startDist(n);
    vector<vector<double>> dist (n, vector<double>(n));

    for (int i = 0; i < n; i++) {
        startDist[i] = hypot(mice[i].x, mice[i].y);
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            dist[i][j] = hypot(mice[i].x - mice[j].x, mice[i].y - mice[j].y);
        }
    } 

    double lo = 0;
    double hi = 1;

    while (!can(hi, mice, startDist, dist, m)) {
        hi *= 2;
    }
    
    for (int i = 0; i < 60; i++) { //arbitrary number that is high enough for precise numbers;
        double mid = (lo + hi) / 2;
        if (can(mid, mice, startDist, dist, m)) {hi = mid;}
        else {lo = mid;}
    }
    
    cout << fixed << setprecision(10) << hi << "\n";

    return 0;
}

bool can(double v0, const vector<Mouse>& mice, const vector<double>& startDist, const vector<vector<double>>& dist, double m) {
    int n = mice.size();
    int FULL = 1 << n;
    vector<vector<double>> dp(FULL, vector<double>(n, 1e100));

    for (int i = 0; i < n; i++) {
        double arrive = startDist[i] / v0;

        if (arrive <= mice[i].t) {
            dp[1 << i][i] = arrive;
        }
    }

    for (int mask = 0; mask < FULL; mask++) {
        int eaten = __builtin_popcount(mask);
        double speed = v0 * pow(m, eaten);
        for (int last = 0; last < n; last++) {
            if (dp[mask][last] > 1e99) {continue;}
            for (int next = 0; next < n; next++) {
                if (mask & (1 << next)) {continue;}
                double arrive = dp[mask][last] + dist[last][next] / speed;
                if (arrive <= mice[next].t) {
                    int newMask = mask | (1 << next);
                    dp[newMask][next] = min(dp[newMask][next], arrive);
                }
            }
        }
    }

    int goal = FULL - 1; 
    for (int last = 0; last < n; last++) {
        if (dp[goal][last] < 1e99) {return true;}
    }
    return false;
}
