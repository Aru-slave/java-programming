def solution(brown, yellow):
    answer = []
    sum = brown + yellow
    for y in range(1,sum+1):
        if sum % y == 0:
            x = sum / y
        if 2*x + 2*y - 4 == brown and (x-2)*(y-2) == yellow:
            return [x,y]
        
        