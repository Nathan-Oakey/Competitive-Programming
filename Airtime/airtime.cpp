#include <iostream>
#include <vector>
using namespace std;

bool greaterSlope(double x, double y, double x1, double y1, double x2, double y2) {
    double s1 = (y1 - y) / (x1 - x);
    double s2 = (y2 - y1) / (x2 - x1);
    if (s1 > s2) { return true; }
    return false;
}

int main(int argc, char const *argv[])
{
    int n, airtime = 0;
    cin >> n;
    vector<double> v(n);
    for (int i = 0; i < n; i++) {
        cin >> v[i];
    }
    for (double i = 0; i < n - 2; i++) {
        if (greaterSlope(i, v[i], i + 1, v[i + 1], i + 2, v[i + 2])) {
            airtime++;
        }
    }
    cout << airtime << "\n";
    return 0;
}
