#include <stdio.h>
#include <limits.h>

int reverseOrder(int x);
int reverse(int x);

int reverse(int x){
    if (x == 0 || x > INT_MAX || x <= INT_MIN) return 0;



    int ans = 0;
    int sign = (x < 0) ? -1 : 1;
    x = (x < 0) ? -x : x;

    while (x != 0) {
        int digit = x % 10;
        x /= 10;

        if (ans > (INT_MAX - digit) / 10) {
            return 0;
        }

        ans = ans * 10 + digit;
    }

    return ans * sign;
}