ans = 0
count = 0

def solution(word):
    alpa = 'AEIOU'
    dfs(word, '', alpa)
    return ans

def dfs(word, currentWord, alpa):
    global ans
    global count
    if currentWord == word:
        ans = count
        return
    if len(currentWord) == 5 or ans != 0:
        return

    for i in range(len(alpa)):
        count += 1
        currentWord = currentWord + alpa[i]
        dfs(word, currentWord, alpa)
        currentWord = currentWord[:len(currentWord) - 1]