def solution(elements):
    sum_set = set() 

    for start in range(len(elements)):
        sum_num = 0  
        for end in range(start,start + len(elements)):
            sum_num += elements[end % len(elements)]
            sum_set.add(sum_num)
    return len(sum_set)