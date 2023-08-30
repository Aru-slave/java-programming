count = 0;
def solution(numbers, target):
    dfs(target, numbers, 0, 0)
    return count
def dfs(target, numbers, currentSum, depth):
    global count
    if currentSum == target and depth == len (numbers):
        count += 1
        return
    if depth == len (numbers):
        return
    
    dfs(target, numbers, currentSum + numbers[depth], depth + 1)
    dfs(target, numbers, currentSum - numbers[depth], depth + 1)