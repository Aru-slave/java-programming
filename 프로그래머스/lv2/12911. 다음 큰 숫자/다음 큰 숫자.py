def solution(n):
    answer = n
    numOfOne = bin(n).count('1')
    while(True):
        answer += 1
        ans_numOfOne = bin(answer).count('1')
        if numOfOne == ans_numOfOne:
            return answer
    return answer