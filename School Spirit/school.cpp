#include <iostream>
#include <cmath>
#include <vector>
#include <iomanip>

using namespace std;

int main() {
    double n; cin >> n;
    double sum = 0, s;
    vector <double> v;
    for (int i = 0; i < n; i++) {cin >> s; sum += s * (pow(4 / 5.0, i)); v.push_back(s);}
    double aoa = 0;
    for (int i = 0; i < n; i++) {
        double a = 0;
        for (int j = 0; j < n; j++) {if (j != i) {int e = (j > i) ? j - 1 : j; a += v[j] * pow(4 / 5.0, e);}}
        aoa += (1 / 5.0) * a;
    }
    cout << fixed << setprecision(10) << (1 / 5.0) * sum << "\n" << aoa / n << "\n";
}