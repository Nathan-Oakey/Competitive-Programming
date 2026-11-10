#include <iostream> 
#include <string>
using namespace std;
int main(int argc, char const *argv[])
{
    string a, op, b;
    cin >> a >> op >> b;
    if (a.length() < b.length()) {
        string temp = a;
        a = b;
        b = temp;
    }
    int la = a.length(), lb = b.length();
    if (op == "+") {
        if (a.length() == b.length()) {
            a[0] = '2';
        } else {
            a[la - lb] = '1';
        } 
    } else {
        for (int i = 0; i < lb - 1; i++) {
            a += "0";
        }
    }
    cout << a << "\n";
    return 0;
}
