#include <stdio.h>
#include <cs50.h>

// just a simple hello world.

 string input;
int main(void) {
   input = get_string("What is your name: ");

   printf("hello, %s\n", input);
}
