#include <iostream>
#include <algorithm>
using namespace std;

int main(int argc, char const *argv[])
{
    int n1, n2;
    cin >> n1 >> n2;

    int cw = (n2 - n1 + 360) % 360, ccw = (n1 - n2 + 360) % 360;
    
    char sign = '\0';
    if (ccw < cw) {
        sign = '-';
        cout << '-' << ccw << "\n";
    } else {
        cout << cw << "\n";
    }
    return 0;
}
