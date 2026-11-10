#include <iostream> 
#include <map> 
#include <vector>

using namespace std;

int main(int argc, char const *argv[])
{
    int n; cin >> n;
    map<string, pair<int, string>> m; 
    for (int i = 0; i < n; i++) {
        string name, bd; int likes; cin >> name >> likes >> bd;
        if (m.contains(bd)) {if (m[bd].first < likes) m[bd] = {likes, name};}
        else m[bd] = {likes, name};
    }
    map<string, int> m2;
    for (const auto& [bd, p] : m) {
        m2[m[bd].second] = 0;
    }
    cout << m2.size() << "\n";
    for (const auto& [name, i] : m2) {
        cout << name << "\n";
    }
    return 0;
}
