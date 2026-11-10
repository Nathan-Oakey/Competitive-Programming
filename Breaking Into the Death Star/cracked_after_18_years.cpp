#include <iostream>
#include <string>
#include <bitset>
using namespace std;

const string NUMBERS[] = {"0", "1", "10", "11", "100", "101", "110", "111", "1000", "1001"};

int main(int argc, char const *argv[])
{
    string toCrack; cin >> toCrack;
    string cracked = "";
    string vowels = "aeiouAEIOU";
    string numbers = "0123456789";
    for (const char& ch : toCrack) {
        if (vowels.find(ch) != string::npos) cracked += ch;
        else if (numbers.find(ch) != string::npos) {
            int n = ch - '0';
            cracked += NUMBERS[n];
        }
        else if (ch == '-') cracked += "\n";
        else cracked += "beepbloop";
    }
    cout << cracked << "\n";
    return 0;
}
