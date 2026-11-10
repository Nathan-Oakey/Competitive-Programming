#include <iostream>

using namespace std;

int main(int argc, char const *argv[])
{
    int n, ta, da, tb, db, ata = 0, atb = 0;
    cin >> n >> ta >> da >> tb >> db;

    for (int i = 0; i < n; i++) {
        ata += ta + (da * i);
        atb += tb + (db * i);
    }

    if (ata < atb) { cout << "Alice" << "\n"; } 
    else if (ata == atb) { cout << "=" << "\n"; }
    else { cout << "Bob" << "\n"; }

    return 0;
}
