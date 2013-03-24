#include <stdlib.h>
#include <stdio.h>

const char* romans[13]  = {"M", "CM", "D", "CD",
                           "C", "XC", "L", "XL",
                           "X", "IX", "V", "IV",
                           "I"};

const int arabic[13] = {1000, 900, 500, 400,
                        100,  90,  50,  40,
                        10,   9,   5,   4,
                        1};

int main(int argc, char *argv[]) {
  int i = atoi(argv[1]);

  int r;
  for (r = 0; r<13; r++) {
    int a = arabic[r];
    while (i >= a) {
      printf("%s", romans[r]);
      i -= a;
    }
  }
  printf("\n");

  return 0;
}
