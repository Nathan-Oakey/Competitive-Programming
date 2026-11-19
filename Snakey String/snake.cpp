#include <iostream>
#include <vector>

using namespace std;

int main() {
    int r, c; cin >> r >> c; 
    string m = ""; 
    vector<string> v(r); 
    for (int i = 0; i < r; i++) cin >> v[i]; 
    for (int i = 0; i < c; i++) for (int j = 0; j < r; j++) if (v[j][i] != '.') m+= v[j][i]; 
    cout << m + "\n";
}