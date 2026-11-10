#include <iostream>

using namespace std;

int main(int argc, char const *argv[])
{
    int w, s; cin >> w >> s;
    int c = (s * (s + 1) / 2);
    const int WEIGHT_OF_TUNGSTEN = 29260;
    cout << (w - (c * WEIGHT_OF_TUNGSTEN)) / 110 << "\n";
    return 0;
}
