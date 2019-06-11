#include<stdio.h>
int main()
{
 int num,sum,first,second;
   scanf("%d",&num);
  first=num%10;
  num=num/10;
  second=num%10;
  sum=first+second;
  printf("%d",sum);
  
  
  return 0;
}