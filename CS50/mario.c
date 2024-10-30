#include <cs50.h>
#include <stdio.h>

// if anybody sees this you can clearly tell i did this all because of how complicated i made this
// I AM AWARE
// I have realized that there was indeed an easier way. also by accident i printed the pyramid upside down


int height;
void pyramid(int a);

int main(void)
{
    do
    {
        height = get_int("what is the height: ");
    }
    while (height <= 0 || height > 8);
    pyramid(height);
}

// function to handle creation of pyramid.
void pyramid(int a)
{
    for (int i = 0; i < a; i++)
    {
        for (int j = 0; j < height - i - 1; j++)
        {
            printf(" "); // handles the spacing or the dots
        }
        // loop to flip pyramid from upside down to left side (i realized i needed a second loop to
        // flip it)
        for (int j = 0; j < i + 1; j++)
        {
            printf("#");
        }
        printf("\n");
    }
}
