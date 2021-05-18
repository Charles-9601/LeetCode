# 38 外观数列

def countAndSay(n: int) -> str:
    if n == 1:
        return '1'
    num = countAndSay(n-1) + '*'
    count = 1
    strBulider = ''
    for i in range(len(num) - 1):
        if num[i] == num[i+1]:
            count += 1
        else:
            strBulider += str(count) + num[i]
            count = 1

    return strBulider


print(countAndSay(4))
