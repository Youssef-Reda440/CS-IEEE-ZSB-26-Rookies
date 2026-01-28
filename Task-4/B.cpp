#include<iostream>
using namespace std;

void Recursion(long long N) {
    if (N == 1)
        cout << N << endl;
    else {
        if (N % 2 == 0) {
            cout << N << " ";
            Recursion(N / 2);
        } else {
            cout << N << " ";
            Recursion(3 * N + 1);
        }
    }
       
}

int main() {
    long long N;
    cin >> N;
    Recursion(N);
    return 0;
}