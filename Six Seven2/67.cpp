#include <iostream> 

using namespace std;

int main(int argc, char const *argv[])
{
    string s; cin >> s;
    for (int i = 0; i < s.length() - 1; i++) {
        if (s[i] == '6') {
            for (int j = i + 1; j < s.length(); j++) {
                if (s[j] == '7') {
                    cout << "six seven" << "\n";
                    return 0;
                }
            }
            break;
        }
    }
    cout << "no" << "\n";
    return 0;
}
