
def solution(n):
    f = [0] * (n + 1)  # Initialize the array to store Fibonacci numbers 
    f[0] = 1
    f[1] = 1
    if n < 2 :
        return f[n]
    for i in range(2, n+1):  # Changed loop condition and range
        f[i] = f[i - 1] + f[i - 2]
        f[i] = f[i] % 1234567

    return f[n]