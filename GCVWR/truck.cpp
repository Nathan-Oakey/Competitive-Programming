#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
    int G, T, n;
    cin >> G >> T >> n;
    int trailerWeight = 0.9 * (G - T);
    for (int i = 0; i < n; i++) {
        int temp;
        cin >> temp;
        trailerWeight -= temp;
    }
    cout << trailerWeight << "\n";
    return 0;
}
