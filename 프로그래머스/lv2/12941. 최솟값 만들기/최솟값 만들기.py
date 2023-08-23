def solution(A, B):
    answer = 0
    A.sort()  # Sort array A in ascending order
    B.sort(reverse=True)  # Sort array B in descending order
    
    for i in range(len(A)):
        answer += A[i] * B[i]  # Add the product of corresponding elements
        
    return answer