#include <iostream>
using namespace std;
int main() {
    int l, n; cin >> l >> n;
    for (int i = 0; i < n; i++) {
        string s; int w; cin >> s >> w;
        cout << s << (w < l ? " lokud\n" : " opin\n");
    }
}