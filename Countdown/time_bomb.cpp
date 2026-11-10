#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int n;
    cin >> n;
    for (int i = n; i > 0; i--) {
        cout << n << endl;
        n--;
    }
    return 0;
}
