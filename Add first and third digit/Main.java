#include<stdio.h>
int main()
{
  int n,sum,first_digit,last_digit;
  scanf("%d",&n);
   first_digit=n%10;
  last_digit=(n/10)/10;
  sum=first_digit+last_digit;
  printf("%d",sum);
  return 0;
}
