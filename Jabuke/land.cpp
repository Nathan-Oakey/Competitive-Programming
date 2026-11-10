#include <iostream> 
#include <vector>
#include <iomanip>
using namespace std;

static double area(int x1, int y1, int x2, int y2, int x3, int y3) {
    return abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0;
}

int main(int argc, char const *argv[])
{
    int xa, ya, xb, yb, xc, yc, n; cin >> xa >> ya >> xb >> yb >> xc >> yc >> n;
    vector<pair<int,int>> v(n);
    for (int i = 0; i < n; i++) cin >> v[i].first >> v[i].second; 
    double a = area(xa, ya, xb, yb, xc, yc);
    int num = 0;
    for (int i = 0; i < n; i++) {
        double a1 = area(v[i].first, v[i].second, xa, ya, xb, yb);
        double a2 = area(v[i].first, v[i].second, xb, yb, xc, yc);
        double a3 = area(v[i].first, v[i].second, xc, yc, xa, ya);
        if (abs(a1 + a2 + a3 - a) < 1e-9) {
            num++;
        }
    }
    cout << fixed << setprecision(1) << a << "\n" << num << "\n";
    return 0;
}

