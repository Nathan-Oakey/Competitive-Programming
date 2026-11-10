#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
    int c; cin >> c;
    int max = 0;
    if (c >= 16000) max += 300;
    else if (c >= 8000) {
        max += 150;
        int ca = c - 8000;
        if (ca < 2000) max += 0;
        else if (ca < 4000) max += 25;
        else if (ca < 6000) max += 50;
        else if (ca < 8000) max += 75;
    } 
    else if (c >= 6000) max += 75;
    else if (c >= 4000) max += 50;
    else if (c >= 2000) max += 25;
    cout << max << "\n";
    return 0;
}
