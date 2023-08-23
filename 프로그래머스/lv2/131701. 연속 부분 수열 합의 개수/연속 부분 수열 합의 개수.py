def solution(elements):
    sum_set = set() 
    n = len(elements)
    for start in range(n):
        sum_num = 0  
        for end in range(start,start + n - 1):# 마지막 전부 다 더하는 경우를 빼준다.
            sum_num += elements[end % n]
            sum_set.add(sum_num)
    return len(sum_set) + 1 #마지막 전부 다 더하는 경우의 수는 무조건 1가지이므로