#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
    int total = 0;
    for (int i = 0; i < 5; i++) {
        int l, w; cin >> l >> w;
        total += (l * w);
    }
    int av = total / 5;

    int n, kwf; cin >> n >> kwf;

    cout << (n * av / kwf) << "\n";

    return 0;
}
