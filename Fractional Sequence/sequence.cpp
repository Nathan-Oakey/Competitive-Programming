#include <iostream> 
#include <numeric>

using namespace std;

int main(int argc, char const *argv[])
{
    long long n; cin >> n;
    long long k = 1, remaining = n - 1;
    if (n == 1) {cout << "1" << "\n"; return 0;}
    while (remaining > k) {
        remaining -= k;
        k++;
    }
    if (remaining == k) cout << k + 1 << "\n";
    else {
        long long g = gcd(k, remaining);
        cout << k << " " << remaining / g << "/" << k / g << "\n";
    }
}
