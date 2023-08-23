def solution(elements):
    sum_set = set() 
    n = len(elements)
    for start in range(n):
        sum_num = 0  
        for end in range(start,start + n - 1):
            sum_num += elements[end % n]
            sum_set.add(sum_num)
    return len(sum_set) + 1