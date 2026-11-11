#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main() {
    string s;
    getline(cin, s);

    int left = 0;
    int right = s.size() - 1;

    while (left < right) {
        while (left < right && string("AEIOUaeiou").find(s[left]) == string::npos) {
            left++;
        }

        while (left < right && string("AEIOUaeiou").find(s[right]) == string::npos) {
            right--;
        }

        swap(s[left], s[right]);
        left++;
        right--;
    }

    cout << s << "\n";
}