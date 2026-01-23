#include<iostream>
using namespace std;

int num_of_digits (long long N, int K) {
    int count = 0;
    while (N > 0){
        N /= K;
        count++;
    }
    return count;
}


int main()
{
    long long N;
    int k;
    cin >> N >> k;
    int result = num_of_digits(N, k);
    cout << result << endl;
    return 0;

}