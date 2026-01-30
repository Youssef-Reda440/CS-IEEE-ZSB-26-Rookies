#include <iostream>
using namespace std;

long long gcd(long long a, long long b) {
    if (b == 0)
        return a;
    return gcd(b, a % b);
}

void find_best_pair(long long X) {
    long long best_a = 1, best_b = X;
    long long best_max = X;

    for (long long d = 1; d * d <= X; d++) {
        if (X % d == 0) {
            long long a = d;
            long long b = X / d;

            if ((a / gcd(a, b)) * b == X) {
                long long current_max = max(a, b);
                if (current_max < best_max) {
                    best_max = current_max;
                    best_a = a;
                    best_b = b;
                }
            }
        }
    }

    cout << best_a << " " << best_b << endl;
}

int main() {
    long long X;
    cin >> X;

    find_best_pair(X);

    return 0;
}
