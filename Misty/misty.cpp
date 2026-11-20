#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

struct E {int u, v, w, id;};

vector<int> p;

int find(int x) {
    if (p[x] != x) p[x] = find(p[x]);
    return p[x];
}

bool unite(int x, int y) {
    x = find(x); y = find(y);
    if (x == y) return false;
    p[x] = y;
    return true;
}

int main() {
    int n, m; cin >> n >> m;
    vector<E> e;
    for (int i = 1; i <= m; i++) {int u, v, w; cin >> u >> v >> w; e.push_back({u, v, w, i});}
    p.resize(n + 1);
    for (int i = 0; i <= n; i++) p[i] = i;
    sort(e.begin(), e.end(), [](E a, E b) {if (a.w != b.w) return a.w < b.w;});
    vector<int> s;
    for (E g : e) { 
        if (unite(g.u, g.v)) s.push_back(g.id);
        if (s.size() == n - 1) break;
    }
    cout << s.size() << "\n";
    for (int i : s) cout << i << "\n";
}