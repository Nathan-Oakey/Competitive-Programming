#include <iostream> 
#include <vector>
#include <numeric>

using namespace std;

int main(int argc, char const *argv[])
{
    int n, k; cin >> n >> k;
    vector<int> v(n), b(k);
    for (int i = 0; i < n; i++) cin >> v[i];
    sort(v.begin(), v.end());
    int i = 0, total = 0, in;
    while (i < n) {
        in = i % k;
        b[in] += v[i];
        total += b[in];
        i++;
    }
    cout << total << "\n";
    return 0;
}
