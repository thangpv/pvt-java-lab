#include <iostream>

using namespace std;

const int N = 1000;

int main() {
    cout << "Hello" << endl;
    int p, q, a[N];
    for (int i = 0; i < N; i++) {
        a[i] = i;
    }
    while (cin >> p >> q) {
        int t = a[p];
        if (t == a[q])
            continue;
        for (int i = 0; i < N; i ++) {
            if (t == a[i])
                a[i] = a[q];
        }
        cout << " " << p << " " << q << endl;
    }
}