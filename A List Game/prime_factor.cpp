#include <iostream>
#include <vector>
using namespace std;

int main(int argc, char const *argv[])
{
    int n; cin >> n;
    vector<int> factors;

    while (n % 2 == 0) {
        factors.push_back(2);
        n /= 2;
    }

    for (int i = 3; i * i <= n; i += 2) {
        while (n % i == 0) {
            factors.push_back(i);
            n /= i;
        }
    }

    if (n > 2) {
        factors.push_back(n);
    }

    for (int factor : factors) {
        cout << factor << " ";
    }
    cout << "\n";
    cout << factors.size() << "\n";

    return 0;
}
