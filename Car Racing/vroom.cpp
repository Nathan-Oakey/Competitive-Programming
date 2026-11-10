#include <iostream>
#include <vector>
using namespace std;
int main(int argc, char const *argv[])
{
    int n;
    vector<int> sums(6);
    vector<int> nums(6);
    cin >> n;
    for (int i = 0; i < n; i++) {
        int car, pos;
        cin >> car >> pos;
        sums[car] += pos;
        nums[car]++;
    }
    int min = 16;
    int car = 0;
    for (int i = 1; i <= 5; i++) {
        int temp = sums[i]/nums[i];
        if (temp < min) {
            min = temp;
            car = i;
        }
    }
    cout << car << "\n" << min << endl;
    return 0;
}
