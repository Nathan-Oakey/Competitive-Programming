#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int n;
    int sum = 0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int b;
        cin >> b;
        sum += b;
    }
    cout << sum << endl;
    return 0;
}
