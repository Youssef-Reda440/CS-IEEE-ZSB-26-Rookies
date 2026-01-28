#include <iostream>
#include <string>
using namespace std;

string s1, s2;
int target = 0;   
int good = 0;    
int total = 0;   
void solve(int idx, int pos) {
    if (idx == s2.size()) {
        total++;
        if (pos == target)
            good++;
        return;
    }

    if (s2[idx] == '+') {
        solve(idx + 1, pos + 1);
    }
    else if (s2[idx] == '-') {
        solve(idx + 1, pos - 1);
    }
    else { 
        solve(idx + 1, pos + 1);    
        solve(idx + 1, pos - 1);
    }
}

int main() {
    cin >> s1;
    cin >> s2;

    for (int i = 0; i < s1.size(); i++) {
        if (s1[i] == '+') target++;
        else target--;
    }
    solve(0, 0);

    double ans = (double)good / (double)total;
    cout.precision(12);
    cout << fixed << ans << endl;

    return 0;
}
