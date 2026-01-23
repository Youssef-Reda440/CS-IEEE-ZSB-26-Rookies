#include<iostream>
using namespace std;

int MonsterBattle(int H, int A) {
    int turns = 0;
    while (H > 0) {
        H -= A;
        turns++;
    }
    return turns;
}

int main() {
    int H, A;
    cin >> H >> A;
    int result = MonsterBattle(H, A);
    cout << result << endl;
    return 0;
}