#include <iostream>
#include <algorithm>
#include <cmath>
#include <iomanip>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(nullptr);
    int n; cin >> n;
    int nWords = 0; float nWoke = 0;
    string s;
    while (cin >> s) {
        nWords++;
        if (count(s.begin(), s.end(), '-') >= 2) nWoke++;
    }
    cout << "Þessi texti er " << fixed << setprecision(0) << ceil((nWoke / nWords) * 100) << "% woke.\n";
}
