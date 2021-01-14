A = [1, 2, 3, 0, 0, 0]
m = 3
B = [2, 5, 6]
n = 3


def merge(A, m, B, n):
    # A[m:] = B
    # return A.sort()
    i, j = 0, 0
    C = []
    while i < m or j < n:
        if i == m:
            C.append(B[j])
            j += 1
        elif j == n:
            C.append(A[i])
            i += 1
        elif A[i] < B[j]:
            C.append(A[i])
            i += 1
        else:
            C.append(B[j])
            j += 1
    return C


print(list(merge(A, m, B, n)))
