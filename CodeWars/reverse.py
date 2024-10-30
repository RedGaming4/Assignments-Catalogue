# Complete the solution so that it reverses the string passed into it.

# 'world'  =>  'dlrow'
# 'word'   =>  'drow'


#factored 

def solution(string):
    return string[::-1]



# unfactored code.

# def solution(string):
#     str = ''
#     for c in (reversed(string)):
#         str += c
#     return str