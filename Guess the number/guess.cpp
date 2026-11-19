#include <iostream>

using namespace std;

int main(){
    int l = 1, h = 1000, m = (l + h) / 2;
    cout << m << "\n";
    cout.flush();
    string s;
    while(cin >> s && s != "correct") {
        if (s == "lower") h = m - 1;
        else l = m + 1;
        m = (l + h) / 2;
        cout << m << "\n";
        cout.flush();
    }
}