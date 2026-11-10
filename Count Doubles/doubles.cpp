#include <iostream> 
#include <vector> 
#include <sstream>

using namespace std;

int main(int argc, char const *argv[])
{
    int n, m; cin >> n >> m;
    cin.ignore();
    string line; getline(cin, line);
    stringstream s(line);

    vector<int> v; int val;
    while (s >> val) v.push_back(val);

    int count = 0, evenCount = 0;

    for (int i = 0; i < m; i++) if (v[i] % 2 == 0) evenCount++;
    if (evenCount >= 2) count++;
    
    for (int i = m; i < v.size(); i++) {
        if (v[i - m] % 2 == 0) evenCount--;
        if (v[i] % 2 == 0) evenCount++;
        if (evenCount >= 2) count++;
    }

    cout << count << "\n";

    return 0;
}
