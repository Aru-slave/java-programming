def solution(s):
    answer = []
    maximum = float('-inf')  # Initialize with negative infinity
    minimum = float('inf')   # Initialize with positive infinity
    
    for i in s.split():  # Split input string by space
        if i:  # Check if the string is not empty
            num = int(i)  # Convert string to integer
            if num >= maximum:
                maximum = num
            if num <= minimum:
                minimum = num
            
    answer.append(str(minimum))  # Convert minimum to string before appending
    answer.append(" ")
    answer.append(str(maximum))  # Convert maximum to string before appending
    
    return ''.join(answer)  # Join the answer list into a single string


