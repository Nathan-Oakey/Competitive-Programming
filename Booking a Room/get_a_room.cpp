#include <iostream>
#include <unordered_set>
using namespace std;
int main(int argc, char const *argv[])
{
    int r, n; 
    unordered_set<int> s;
    cin >> r >> n;

    for (int i = 0; i < n; i++) {
        int temp;
        cin >> temp;
        s.insert(temp);
    }

    int c = 1; 
    while (s.contains(c)) {
        c++;
        if (c > r) {
            cout << "too late" << "\n";
            return 0;
        }
    }
    cout << c << "\n";
    return 0;
}
