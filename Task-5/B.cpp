#include <iostream>
using namespace std;

bool isprime(long long n){
    if (n < 2 ) return false;

    for (long long i = 2; i * i <= n; i++) {
        if (n % i == 0) return false;
    }
    return true;
}

int main() {
    int t;
    cin >> t ;

    while (t--){
        long long n;
        cin >> n;

        if (isprime(n)){
            cout << "NO" << endl;
            continue;
        }

        long long a = -1, b = -1, c = -1;
        long long temp = n;
        
        for (int i = 2; i * i <= temp; i++) {
            if (temp % i == 0){
                a = i;
                temp /= i;
                break;
            }
        }

        for (int i = 2; i * i <= temp; i++) {
            if (temp % i == 0 && i != a){
                b = i;
                temp /= i;
                break;
            }
        }

        c = temp;
        if (a != -1 && b != -1 && c > 1 && c != a && c != b){
            cout << "YES" << endl;
            cout << a << " " << b << " " << c << endl;
        }
        else {
            cout << "NO" << endl;
        }
    }
   
    return 0;
}