#include<stdio.h>
int main()
{
    int date,month,year;
    scanf("%d",&date);
    scanf("%d",&month);
    scanf("%d",&year);
    int date2,month2,year2;
    scanf("%d",&date2);
    scanf("%d",&month2);
    scanf("%d",&year2);
    if(date==date2 && month==month2 && year==year2)
    {
        printf("No Fine");
    }
    else if(date<date2 && month==month2 && year==year2)
    {
        printf("Fine is 15 sent");
    }
    else if(month<month2 && year==year2)
    {
        printf("Fine is 5 dollar");
    }
    else if(year<year2)
    {
        printf("Fine is 100 dollar");
    }


}