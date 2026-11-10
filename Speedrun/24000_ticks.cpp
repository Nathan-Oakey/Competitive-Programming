#include <iostream>
#include <vector>
using namespace std;

bool customComp(pair<int, int> task1, pair<int, int> task2) {
    return task1.second < task2.second;
}

int main(int argc, char const *argv[])
{
    int g, n, t;
    cin >> g >> n;
    vector<pair<int, int>> tasks(n);
    for (int i = 0;  i < n; i++) {
        pair<int, int> task;
        cin >> task.first >> task.second;
        tasks[i] = task;
    }

    sort(tasks.begin(), tasks.end(), customComp);

    int c = 0, lastEnd = -1;
    for(int i = 0; i < n; i++) {
        if (tasks[i].first >= lastEnd) {
            c++; lastEnd = tasks[i].second;
        }
    }
    
    if (c >= g) {
        cout << "YES" << "\n";
    } else {
        cout << "NO" << "\n";
    }

    return 0;
}
