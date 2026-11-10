#include <iostream>

int main(int argc, char const *argv[])
{
    int x, y;
    int quadrant = 0;
    std::cin >> x >> y;
    if (x > 0 && y > 0) {quadrant = 1;}
    else if (x < 0 && y > 0) {quadrant = 2;}
    else if (x < 0 && y < 0) {quadrant = 3;}
    else {quadrant = 4;}

    std::cout << quadrant << std::endl;
    return 0;
}
