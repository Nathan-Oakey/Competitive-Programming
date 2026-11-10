#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(int argc, char const *argv[])
{
    vector<int> boxes(6);
    int h1, h2;
    for (int i = 0; i < 6; i++) {
        cin >> boxes[i];
    }
    cin >> h1 >> h2;
    for (int i = 0; i < 4; i++) {
        for (int j = i + 1; j < 5; j++) {
            for (int k = j + 1; k < 6; k++) {
                if (boxes[i] + boxes[j] + boxes[k] == h1) {
                    vector<int> tower = {boxes[i], boxes[j], boxes[k]};
                    erase(boxes, tower[0]); erase(boxes, tower[1]); erase(boxes, tower[2]);
                    sort(tower.rbegin(), tower.rend());
                    sort(boxes.rbegin(), boxes.rend());

                    cout << tower[0] << " " << tower[1] << " " << tower[2] << " " << boxes[0] << " " << boxes[1] << " " << boxes[2];
                }
            }
        }
    }
    
    return 0;
}
