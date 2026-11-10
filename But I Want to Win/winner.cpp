#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(int argc, char const *argv[])
{
    int c; cin >> c;
    vector<long long> v(c);
    long long total = 0;
    for (int i = 0; i < c; i++) {
        int n; cin >> v[i];
        total += v[i];
    }

    sort(v.begin(), v.end());
    int r = 0; long long max = v[c - 1], smax = v[c - 2];
    if (2 * max >= total) {cout << "IMPOSSIBLE TO WIN" << "\n"; return 0;}

    while (2 * smax <= total && r < c - 2) {
        smax += v[r];
        r++;
    }
    
    cout << r << "\n";
    return 0;
}
