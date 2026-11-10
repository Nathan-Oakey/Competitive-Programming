#include <iostream> 
#include <vector> 
#include <cmath>
using namespace std;

int main(int argc, char const *argv[])
{
    int n;
    cin >> n;
    vector<vector<int>> matrix(n, vector<int>(n));
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> matrix[i][j];
        }
    }
    long long permanent = 0;
    int totalSubsets = 1 << n;

    for (int mask = 0; mask < totalSubsets; mask++) {
        long long rowSumProduct = 1;
        int setSize = 0;

        for (int j = 0; j < n; j++) {
            long long colSum = 0;
            for (int i = 0; i < n; i++) {
                if ((mask >> i) & 1) {colSum += matrix[i][j];}
            }
            rowSumProduct *= colSum;
        }

        setSize = __builtin_popcount(mask);
        if ((n - setSize) % 2 == 1) {permanent -= rowSumProduct;}
        if ((n - setSize) % 2 == 0) {permanent += rowSumProduct;}
    }
    cout << permanent << "\n";
    return 0;
}
