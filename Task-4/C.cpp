#include <iostream>
using namespace std;

int n;
long long a[25];   
long long ans = 1e18;

void solve(int idx, long long sum1, long long sum2) {
    if (idx == n) {
        long long diff = llabs(sum1 - sum2);
        if (diff < ans)
            ans = diff;
        return;
    }

    solve(idx + 1, sum1 + a[idx], sum2);
    solve(idx + 1, sum1, sum2 + a[idx]);
}

int main() {
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    solve(0, 0, 0);

    cout << ans << endl;

    return 0;
}
