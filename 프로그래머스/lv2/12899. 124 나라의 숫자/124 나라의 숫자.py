def solution(n):
    ans = ''
    while n > 0:
        if n % 3 == 1:
            ans += '1'
        if n % 3 == 2:
            ans += '2'
        if n % 3 == 0:
            ans += '4'
        n = (n-1) // 3
    return ans[::-1]
        
    