#include <iostream>
using namespace std;

int main() {
    int n, k;
    cin >> n >> k;

    int y[205];  
    for (int i = 1; i <= 2*n+1; i++) {
        cin >> y[i];
    }

    for (int i = 2; i <= 2*n && k > 0; i += 2) {
        if (y[i] > y[i-1] + 1 && y[i] > y[i+1] + 1) {
            y[i]--;   
            k--;
        }
    }

    for (int i = 1; i <= 2*n+1; i++) 
        cout << y[i] << " ";
    
    return 0;
}
