#include <iostream>

using namespace std;

int V[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 23, 34, 45, 56, 67, 78, 89, 123, 234, 345, 456, 567, 678, 789, 1234, 2345, 3456, 4567, 5678, 6789, 12345, 23456, 34567, 45678, 56789, 123456, 234567, 345678, 456789, 1234567, 2345678, 3456789, 12345678, 23456789, 123456789};

int main(int argc, char const *argv[])
{
    int t; cin >> t; 
    for (int i = 0; i < t; i++) {
        int n; cin >> n;
        bool found = false;
        for (int j = 0; j < sizeof(V) / sizeof(V[0]) && !found; j++) {
            if (n <= V[j]) {
                cout << V[j] << "\n";
                found = true;
            }
        }
        if (!found) cout << "-1\n";
    }
    return 0;
}
