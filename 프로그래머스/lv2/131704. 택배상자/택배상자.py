def solution(order):
    answer = 0
    subContainer = []  # 정렬 순서를 맞추지 않은 상자 번호들을 저장하는 리스트
    i = 0  # order 리스트를 탐색하기 위한 인덱스

    # 주요 루프: order 처리
    while i != len(order):
        subContainer.append(i + 1)  # 다음 상자 번호를 subContainer에 추가합니다.

        # subContainer의 마지막 상자 번호가 기대하는 순서와 일치하는지 확인
        while subContainer and subContainer[-1] == order[answer]:
            answer += 1  # 올바른 순서의 상자 개수를 증가시킵니다.
            subContainer.pop()  # 처리된 상자 번호를 subContainer에서 제거합니다.

        i += 1  # 다음 상자 번호로 이동합니다.

    return answer  # 올바른 순서의 상자 개수를 반환합니다.
