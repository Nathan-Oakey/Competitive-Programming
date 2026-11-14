#include <iostream> 
#include <algorithm>
#include <queue>

using namespace std;

int main () {
    int m, f, n; cin >> m >> f >> n;
    int l = max({m, f, n});
    if (l > ((m + f + n) + 1) / 2) {cout << "O nei!\n"; return 0;}
    priority_queue<pair<int, char>> pq; 
    if (m > 0) pq.push({m, 'M'});
    if (f > 0) pq.push({f, 'F'});
    if (n > 0) pq.push({n, 'N'});
    string s = ""; 
    pair<int, char> prev = {0, '?'};
    while (!pq.empty()) {
        auto curr = pq.top();
        pq.pop();
        s += curr.second;
        curr.first--;
        if (prev.first > 0) pq.push(prev);
        prev = curr;
    }
    cout << s << "\n";
}