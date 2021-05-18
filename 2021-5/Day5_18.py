# 1442 形成两个异或相等的三元组数目

def countTriplets(arr: list[int]) -> int:
    n = len(arr)
    s = [0]
    for val in arr:
        s.append(s[-1] ^ val)
        print(s)

    ans = 0
    for i in range(n):
        for j in range(i + 1, n):
            for k in range(j, n):
                if s[i] == s[k + 1]:
                    ans += 1
    return ans


print(countTriplets([2, 3, 1, 6, 7]))
