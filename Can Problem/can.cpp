#include <iostream>
#include <cmath>
#include <iomanip>

using namespace std;

struct Point {
    double x, y;
};

int main() {
    Point yh, fh, p1, p2;

    cin >> yh.x >> yh.y >> fh.x >> fh.y >> p1.x >> p1.y >> p2.x >> p2.y;
    double dx = p2.x - p1.x;
    double dy = p2.y - p1.y;
    double side1 = dx * (yh.y - p1.y) - dy * (yh.x - p1.x);
    double side2 = dx * (fh.y - p1.y) - dy * (fh.x - p1.x);
    Point B = fh;

    if (side1 * side2 > 0) {
        double t = ((fh.x - p1.x) * dx +
                    (fh.y - p1.y) * dy) /
                   (dx * dx + dy * dy);

        Point projection = {
            p1.x + t * dx,
            p1.y + t * dy
        };

        B = {
            2 * projection.x - fh.x,
            2 * projection.y - fh.y
        };
    }

    double answer = hypot(yh.x - B.x, yh.y - B.y);

    cout << fixed << setprecision(10) << answer << '\n';
}