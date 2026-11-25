#include <iostream>
#include <cmath>
#include <algorithm>
using namespace std;

int main() {
    int x1, y1, x2, y2; cin >> x1 >> y1 >> x2 >> y2;
    int dx = x2 - x1;
    int dy = y2 - y1;
    if (dx > 0 && dy > 0) cout << "NE\n";
    else if (dx > 0 && dy < 0) cout << "SE\n";
    else if (dx < 0 && dy < 0) cout << "SW\n";
    else if (dx < 0 && dy > 0) cout << "NW\n";
    if (abs(dx) > abs(dy)) cout << (dx > 0 ? "E\n" : "W\n");
    else if (abs(dy) > abs(dx)) cout << (dy > 0 ? "N\n" : "S\n");
}