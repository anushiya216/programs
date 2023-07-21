#include <stdio.h>
#include <string.h>
char stack[100];
int top = -1;
void push(char x)
{
    stack[++top] = x;
}
char pop()
{
    if(top == -1)
        return -1;
    else
        return stack[top--];
}
int match(char c1, char c2)
{
    if(c1==')' && c2=='(')
    {
        return 1;
    }
    else if(c1==']' && c2=='[')
    {
        return 1;
    }
    else if(c1=='}' && c2=='{')
    {
        return 1;
    }

    else
    {
        return 0;
    }
}
int is_balanced(char *exp)
{
    int i;
    for (i = 0; i<strlen(exp); i++)
    {
        if (exp[i] == '(' || exp[i]== '[' || exp[i] == '{')
        {
            push(exp[i]);
        }
        if (exp[i] == ')' || exp[i]== ']' || exp[i] == '}')
        {
            if(top==-1)
            {
                return 0;
            }
            else if(!match(exp[i], pop()))
            {
                return 0;
            }
        }
    }
    if (top==-1)
    {
        return 0;
    }
    else
    {
        return 1;
    }
}


int main()
{
    char exp[100];
    printf("Enter an expression: ");
    scanf("%s", exp);
    int result;
    result=is_balanced(exp);
    if (result==0)
    {
        printf("The expression is balanced.\n");
    }
    else
    {
        printf("The expression is not balanced.\n");
    }

    return 0;
}