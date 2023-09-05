def solution(n, computers):
    visited = [False] * n
    count = 0
    for i in range(n):
        if not visited[i]:
            count += 1
            dfs(i, computers, visited)
    return count

def dfs(node, computers, visited):
    stack = [node]
    while stack:
        x = stack.pop()
        visited[x] = True
        for i in range(len(computers[x])):
            if x != i and computers[x][i] == 1 and not visited[i]:
                stack.append(i)
