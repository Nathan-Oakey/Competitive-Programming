#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int n;
    while (cin >> n && n != 0) {
        vector<int> a(n);
        for (int i = 0; i < n; i++) cin >> a[i];
        vector<int> d(n, 1);
        for (int i = n - 1; i >= 0; i--) for (int j = i + 1; j < n; j++) if (a[j] > a[i]) d[i] = max(d[i], d[j] + 1);
        int b = max_element(d.begin(), d.end()) - d.begin();
        int len = *max_element(d.begin(), d.end());
        vector<int> r;
        int m = len;
        int li = -1;
        int lv = -1;

        while (m > 0) {
            int bi = -1;
            for (int i = li + 1; i < n; i++) if (a[i] > lv && d[i] >= m) if (bi == -1 || a[i] < a[bi]) bi = i;
            r.push_back(a[bi]);
            li = bi;
            lv = a[bi];
            m--;
        }
        cout << len << " ";
        for (int x : r) cout << x << " ";
        cout << "\n";
    }
}