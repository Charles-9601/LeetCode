def clumsy(N):
    if N==1:
        return 1
    elif N==2:
        return 2
    elif N==3:
        return 6
    elif N==4:
        return 7
    if N % 4 == 0:
        return N + 1
    elif N % 4 <= 2:
        return N + 2
    else :
        return N-1


n = clumsy(4)
print(n)