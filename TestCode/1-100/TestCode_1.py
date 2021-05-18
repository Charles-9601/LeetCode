#541 反转字符串II
def reverseStr(s: str, k: int) -> str:
    a = list(s)
    for i in range(0, len(a), 2*k):
        a[i:i+k] = reversed(a[i:i+k])
    return "".join(a)


print(reverseStr("abcdefg", 2))