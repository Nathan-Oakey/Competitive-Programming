#include <iostream> 
#include <vector>
#include <algorithm>
#include <limits>
using namespace std;

int main() {
    int m; cin >> m;
    int lg = numeric_limits<int>::max(), hg = 0, lt = numeric_limits<int>::max(), ht = 0;
    vector<int> a;
    for (int i = 0; i < m; i++) {
        vector<int> s;
        int g, t = 0; cin >> g; 
        for (int j = 0; j < g; j++) {
            int c; cin >> c;
            t += c;
            s.push_back(c);
        }

        int tmin = *min_element(s.begin(), s.end());
        int tmax = *max_element(s.begin(), s.end());
        lg = min(lg, tmin);
        hg = max(hg, tmax);
        lt = min(t, lt);
        ht = max(t, ht);
    }
    cout << hg << "\n" << lg << "\n" << ht << "\n" << lt << "\n";
}