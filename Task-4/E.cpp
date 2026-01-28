#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

string s;
bool used[10];
string current;
vector<string> results;

void solve() {
    if (current.size() == s.size()) {
        results.push_back(current);
        return;
    }

    for (int i = 0; i < s.size(); i++) {
        if (used[i]) continue;

        if (i > 0 && s[i] == s[i - 1] && !used[i - 1]) continue;

        used[i] = true;
        current.push_back(s[i]);

        solve();  

        current.pop_back();
        used[i] = false;
    }
}

int main() {
    cin >> s;
    sort(s.begin(), s.end());

    solve();

    cout << results.size() << "\n";
    for (auto &x : results) {
        cout << x << "\n";
    }

    return 0;
}
