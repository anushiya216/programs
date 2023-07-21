#include<string.h>
#include<stdio.h>
struct movie_details person[300];

struct movie_details{
	char name[25];
	char phoneno[15];
	int seatnum;
	int id;
};
int changepriceticket(int price)
{
	char pass[10],pak[10]="admin";
	printf("Enter the password to change price of ticket: ");
	scanf("%s",&pass);
	if (strcmp(pass,pak)==0)
	{
		printf("Please enter new price: ");
		scanf("%d",&price);
		printf("Price Updated Successfully: ");
		system("PAUSE");
		system("CLS");
	}
	else
		printf("The entered password is wrong! ");
	return price;
}

void show1(int choice,char name[10],int id1,int price)
{
        int count = 0;
		system("cls");
		printf("\n\n");
        //printf("\t-----------------THEATER BOOKING TICKET----------------\n");
        printf("\t******************\n");
        printf("\t Booking ID : %d \t\t\tShow Name : Harry Potter-7\n",id1);
        printf("\t Customer  : %s\n",name);
        printf("\t\t\t                              Date      : 07-05-2019\n");
        printf("\t                                              Time      : 07:00pm\n");
        printf("\t                                              Hall      : 02\n");
        printf("\t                                              seats No. : %d  \n",choice);
        printf("\t                                              price . : %d  \n\n",price);
		person[count].id=id1;
        printf("\tThankYou For Booking a Ticket\n");
        return;
}

void show2(int choice,char name[10],int id1,int price)
{
        int count =0;
		system("cls");
		printf("\n\n");
       
        printf("\t============================================================\n");
        printf("\t Booking ID : %d \t\t\tShow Name :The Invisible Man\n",id1);
        printf("\t Customer  : %s\n",name);
        printf("\t\t\t                                Date      : 15-04-2020\n");
        printf("\t                                              Time      : 09:00pm\n");
        printf("\t                                              Hall      : 03\n");
        printf("\t                                              seats No. : %d  \n",choice);
        printf("\t                                              price . : %d  \n\n",price);
        person[count].id=id1;
       printf("\tThankYou For Booking a Ticket\n");
        return;
}

void show3(int choice,char name[10],int id1,int price)
{ 
        int count = 0;
		system("cls");
		printf("\n\n");
        //printf("\t-----------------THEATER BOOKING TICKET----------------\n");
        printf("\t*********************\n");
        printf("\t Booking ID : %d \t\t\tShow Name : Tenet \n",id1);
        printf("\t Customer  : %s\n",name);
        printf("\t\t\t                              Date      : 15-07-2020\n");
        printf("\t                                              Time      : 10:00pm\n");
        printf("\t                                              Hall      : 04\n");
        printf("\t                                              seats No. : %d  \n",choice);
        printf("\t                                              price . : %d  \n\n",price);
        person[count].id=id1;
        printf("\tThankYou For Booking a Ticket\n");
        return;
}

void reserveticket(int *array,int price,int selection )
{
		int i,j;
		int count =0;
		int id1 = 1000;
		printf("\n                                SCREEN\n\n\n");
		for (i=1;i<=100;i++)
		{
			if (array[i]==0)
				printf("%d\t",i);
			else
				printf("*\t",i);
			if(i%10==0)
				printf("\n\n");
		}
		printf("Please enter your name: ");
		scanf(" %19[^\n]%*[^\n]",&person[count].name);
		printf("Please enter your phone number: ");
		scanf("%u",&person[count].phoneno);
		printf("Please select seat number you want? ");
		scanf("%d",&j);
		if (j>100||j<1)
			{
				printf("seat1 number is unavailable in this theater\n");
				printf("Please re-enter seat number: ");
				scanf("%d",&j);
			}
		if (array[j]==1)
			{
				printf("Sorry, this ticket is already booked! Please choose another seat.\n");
				scanf("%d",&j);
			}
		else
			array[j]=1;
		person[count].seatnum=j;
		if (selection==1)
			show1(j,person[count].name,id1,price);
		else if (selection==2)
			show2(j,person[count].name,id1,price);
		else
			show3(j,person[count].name,id1,price);
		id1++;
}



void cancelticket(int *array)
{
      int Cseat,i,stop;
	  printf("Please enter ID number of ticket: ");
	  scanf("%d",&Cseat);
	  for (i=0;i<300;i++)
	  {
	  		if(Cseat==person[i].id)
	  		{
					 stop=5;
					 system("cls");
					 printf("%s your ticket is %d cancelled",person[i].name,person[i].seatnum);
					 array[person[i].seatnum]=0;
					 i=300;
	  		}
	  }
	  if (stop!=5)
	  		printf("Ticket ID number is incorrect please enter right one to cancel ticket: \n");
}

int enterchoice(void)
{
	int choice;
	printf("                 Welcome To Movie Ticket Booking System\n");
	printf(" ************#######************\n");
	printf("             1- Admin           \n");
	printf("             2- User          \n");
	printf("             3- Exit system:                                   \n");
	printf("**********************\n");
	printf("  Enter your choice: ");
	scanf("%d",&choice);
	return choice;
}

int movieselect(void)
{
	int i;
	printf("\t\t\tMovie Name\n");
	printf("\t\t\t-------------------------------------\n");
	printf("\t\t\tpress 1 for Harry Potter\n\n");
	printf("\t\t\tpress 2 for The Invisible Man\n\n");
	printf("\t\t\tpress 3 for Tenet\n");
	scanf("%d",&i);
	return i;
}

void details(void)
{
	int i;
	int count =0;
	char pass[10],pak[10]="admin";
	printf("Enter the password to see details: ");
	scanf("%s",&pass);
	if (strcmp(pass,pak)==0)
	{
		for (i=0;i<count;i++)
		{
			printf("seat no: %d is booked by %s booking id is %d\n",person[i].seatnum,person[i].name,person[i].id);
		}
	}
	else
		printf("Entered password is wrong \n");
		system("PAUSE");
		system("CLS");
}

int ListofMovies(void)

{
	int i;
	system("cls");
	printf("\t\t\tMovie Name?\n");
	printf("\t\t\t----------------------------\n\n");
	printf("\t\t\tpress 1 for Harry Potter\n\n");
	printf("\t\t\tpress 2 for The Invisible Man\n\n");
	printf("\t\t\tpress 3 for Tenet\n");
	scanf("%d",&i);
	return i;
}

