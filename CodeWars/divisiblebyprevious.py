# Take a number and check each digit if it is divisible by the digit on its left checked and return an array of booleans.

# The booleans should always start with false becase there is no digit before the first one.

# Examples
# 73312        => [false, false, true, false, true]
# 2026         => [false, true, false, true]
# 635          => [false, false, false]
# *** Remember 0 is evenly divisible by all integers but not the other way around ***



def divisible_by_last(n):
    list = [False]
    m = str(n)
    #enumarate 
    for i, a in enumerate(m):
        print(i)
        print(a)
        if i == 0:
            continue
        num = int(m[i - 1])
        if num == 0:
            list.append(False)
            continue
        yeet =  int(a) % num
        if yeet == 0:
            list.append(True) 
        else:
            list.append(False)
    return list
        