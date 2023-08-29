#include <stdio.h>

int main()
{
	int i,j,k,n,a=65;
	scanf("%d",&n);
	for (i=1;i<=n;i++) 
	{
		for(j=1;j<=n-i;j++) 
		{
			printf(" ");	
		}
		for(k=1;k<=2*i-1;k++) 
		{
			printf("%c",a+k-1);
		}
		printf("\n");
	}
		
	for(i=n-1;i>0;i--) 
	{
		for(j=1;j<=n-i;j++) 
		{
			printf(" ");
		}
		for(k=1;k<=2*i-1;k++) 
		{
			printf("%c",a+k-1);
		}
		printf("\n");
	}
}