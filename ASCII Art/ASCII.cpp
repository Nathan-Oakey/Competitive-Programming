#include <iostream>
#include <sstream>

using namespace std;

int main() {
    string l, w, r; getline(cin, l);
    stringstream ss(l);
    while (ss >> w) {
        if (!r.empty()) r += " ";
        r += w;
    }
    if (r == "What is problem A about?") cout << "Problem A is about Ascii Art\n   _     __   __  _   _\n  / \\   / /  / / | | | |\n / _ \\  \\ \\ | |  | | | |\n/_/ \\_\\ /_/  \\_\\ |_| |_|\n"; 
    else if (r == "What is problem B about?") cout << "Problem B is about Fortnite\n###############\n###############\n####       /###\n####   ########\n####       ####\n####   ########\n####   ########\n####   ########\n####_~<########\n###############\n";
    else if (r == "What is problem C about?") cout << "Problem C is about The Legend of Zelda\n     /\\\n    /  \\\n   /____\\\n  /\\    /\\\n /  \\  /  \\\n/____\\/____\\\n";
    else cout << "I am not sure how to answer that.\n";
}