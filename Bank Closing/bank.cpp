#include <iostream> 
#include <queue>
#include <vector>
#include <string>
using namespace std;
int main() {
    int n, k; cin >> n >> k;
    priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> pq;
    for (int i = 0; i < k; i++) {
        int t; cin >> t; 
        pq.push({t, i});
    }
    for (int i = 0; i < n; i++) {
        auto [t, q] = pq.top();
        pq.pop();
        cout << q + 1 << endl;
        string r; cin >> r; 
        if (r != "DONE") {
            int nt = stoi(r);
            pq.push({nt, q});
        }
    }
    cout << "DONE" << endl;
}