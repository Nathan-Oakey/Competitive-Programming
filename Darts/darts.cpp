#include <iostream>
#include <cmath> 

using namespace std;

int RADII[] = {20, 40, 60, 80, 100, 120, 140, 160, 180, 200, };
int POINTS[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

int main(int argc, char const *argv[])
{
    int t; cin >> t;
    for (int i = 0; i < t; i++) {
        int n; cin >> n;
        int points = 0;
        for (int i = 0; i < n; i++) {
            int x, y; cin >> x >> y;
            double r = sqrt(x * x + y * y);
            int counter = 0;
            while (counter < size(RADII) && r > RADII[counter]) {
                counter++;
            }
            if (counter < size(RADII)) {
                points += POINTS[counter];
            }
        }
        cout << points << "\n";
    }
    return 0;
}

