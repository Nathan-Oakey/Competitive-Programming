#include <iostream> 
#include <random>
#include <string>
using namespace std;

int main(int argc, char const *argv[])
{
    int n; cin >> n;
    random_device rd;
    mt19937 gen{(rd())};
    uniform_int_distribution<> strLenDist(8, 12);
    uniform_int_distribution<> azDist (97, 122);
    uniform_int_distribution<> AZDist (65, 90);
    uniform_int_distribution<> numDist (48, 57);
    uniform_int_distribution<> specialDist (33, 47);
    uniform_int_distribution<> regularDist (33, 126);

    for (int i = 0; i < n; i++) {
        int l = strLenDist(gen);
        string str;
        for (int j = 0; j < l; j++) {
            char c;
            if (j == 0) {
                c = static_cast<char>(azDist(gen));
            }
            else if (j == 1) {
                c = static_cast<char>(AZDist(gen));
            }
            else if (j == 2) {
                c = static_cast<char> (specialDist(gen));
            }
            else if (j == 3) {
                c = static_cast<char> (numDist(gen));
            }
            else {
                c = static_cast<char> (regularDist(gen));
            }
            str += c;
        }
        cout << str << "\n";
    }
    return 0;
}
