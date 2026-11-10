#include <iostream>
#include <string>
using namespace std;
int main(int argc, char const *argv[])
{
    string j, d;
    cin >> j >> d;
    if (j.length() >= d.length()) {cout << "go" << endl;}
    else {cout << "no" << endl;}
    return 0;
}

