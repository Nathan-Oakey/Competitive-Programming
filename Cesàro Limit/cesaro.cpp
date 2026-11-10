#include <iostream>
#include <vector>
#include <numeric> 
using namespace std;

int main(int argc, char const *argv[])
{
    int N; cin >> N;
    vector<int> v(N);
    for (int i = 0; i < N; i++) {
        cin >> v[i];
    }

    int s = accumulate(v.begin(), v.end(), 0);
    
    if (s < 0) {
        cout << "-INFINITY" << '\n';
    } else if (s > 0) {
        cout << "INFINITY" << '\n';
    } else {
        int sum = 0;
        int sumTotal = 0;
        for (int i = 0; i < N; i++) {  
            sum += v[i];
            sumTotal += sum;
        }
        cout << static_cast<double>(sumTotal) / N << '\n';
    }
    return 0;
}
