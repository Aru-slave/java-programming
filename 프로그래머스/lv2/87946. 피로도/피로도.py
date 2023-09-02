def solution(k, dungeons):
    return dfs(k, dungeons, 0, [])

def dfs(k, dungeons, depth, visited):
    if depth == len(dungeons):
        return depth  # 깊이를 반환하도록 수정

    max_depth = depth  # 최대 깊이를 기록하기 위한 변수
    for i in range(len(dungeons)):
        if dungeons[i][0] <= k and i not in visited:
            visited.append(i)
            max_depth = max(max_depth, dfs(k - dungeons[i][1], dungeons, depth + 1, visited))
            visited.remove(i)

    return max_depth