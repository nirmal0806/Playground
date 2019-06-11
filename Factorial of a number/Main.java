#include <stdio.h>
int main() {
	int c, num, fact = 1;
 

  scanf("%d", &num);
 
  for (c = 1; c <= num; c++)
    fact = fact * c;
 
  printf(" %d\n",fact);
	return 0;
}