#include <iostream>
#include <vector>

using namespace std;

int main(int argc, char const *argv[])
{
    int n, k; cin >> n >> k;

    vector<int> v;

    for (int i = 0; i < k; i++) {
        int a; cin >> a;

        if (n - a < n / 2) {
            v.push_back(n);
        }
        else if (n - a >= n / 2) {
            v.push_back(1);
        }
        
    }

    for (int i = 0; i < v.size() - 1; i++) {
        cout << v[i] << " ";
    }
    cout << v[v.size() - 1] << "\n";

    return 0;
}
