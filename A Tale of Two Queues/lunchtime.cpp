#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int l, r, temp;
    int sl = 0, sr = 0;
    cin >> l >> r; 
    for (int i = 0; i < l; i++) {
        cin >> temp;
        sl += temp;
    }
    for (int i = 0; i < r; i++) {
        cin >> temp;
        sr += temp;
    }
    if (sl < sr) {cout << "left" << endl;}
    else if (sl == sr) {cout << "either" << endl;}
    else {cout << "right" << endl;}
    return 0;
}
