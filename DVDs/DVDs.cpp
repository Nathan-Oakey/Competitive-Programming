#include <iostream> 
using namespace std;

int main(int argc, char const *argv[])
{
    int k; cin >> k;
    for (int i = 0; i < k; i++) {
        int n, next = 1, removals = 0; cin >> n;
        for (int j = 0; j < n; j++) {
            int val; cin >> val;
            if (val == next) next++;
            else removals++;
        }
        cout << removals << "\n";
    }
    return 0;
}
