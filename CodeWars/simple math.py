# <!-- This kata is about multiplying a given number by eight if it is an even number and by nine otherwise. -->


def simple_multiplication(number) :
    if number % 2 == 1:
        odd = number * 9
        return(odd)
    
    else:
        even = number * 8
        return(even)