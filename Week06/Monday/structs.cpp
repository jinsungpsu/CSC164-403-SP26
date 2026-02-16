/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>

struct Food {
    string name;
    string allergens;
    double price;
}

int main()
{
    std::cout<<"Hello World";
    
    string foodName = "burger";
    double cost = 5.99;
    string allergens = "wheat";
    
    Food menuItem1;
    menuItem1.foodName = "burger";
    menuItem1.cost = 5.99;
    menuItem1.allergens = "wheat";

    return 0;
}
