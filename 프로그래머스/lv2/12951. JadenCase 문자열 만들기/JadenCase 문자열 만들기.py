def solution(s):
    answer = ''
    s = s.lower()
    s = s[0].upper() + s[1:]  # Corrected syntax for capitalizing the first letter
    
    for i in range(len(s) - 1):  # Changed len(s) + 1 to len(s) - 1
        if s[i] == ' ' and s[i+1] != ' ':
            s = s[:i+1] + s[i+1].upper() + s[i+2:]  # Replaced incorrect replace() with string slicing
    
    return s