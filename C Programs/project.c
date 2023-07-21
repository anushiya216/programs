#include <stdio.h>

int main()
{
    int candidate1_votes = 0;
    int candidate2_votes = 0;
    int total_voters = 60;
    int voter_choice;
    char name1[10], name2[10];

    printf("Welcome to the voting system!\n\n");

    printf("Enter candidate name1: ");
    scanf("%s", name1);
    printf("Enter candidate name2: ");
    scanf("%s", name2);

    for (int i = 0; i < total_voters; i++)
    {
        printf("Voter %d, please choose a candidate:\n", i+1);
        printf("1. %s \n",name1);
        printf("2. %s \n",name2);
        scanf("%d", &voter_choice);

        switch(voter_choice)
        {
            case 1:
                candidate1_votes++;
                break;
            case 2:
                candidate2_votes++;
                break;
            default:
                printf("Invalid choice, please try again.\n");
                i--;
        }
    }

    if (candidate1_votes > candidate2_votes)
    {
        printf("\n%s wins with %d votes!", name1, candidate1_votes);
    }
    else if (candidate2_votes > candidate1_votes)
    {
        printf("\n%s wins with %d votes!", name2, candidate2_votes);
    }
    else
    {
        printf("\nIt's a tie!");
    }

    return 0;
}