# -*- coding: utf-8 -*-
# @Time     : 2021/5/27 23:38
# @Author   : 张其鹏
# @File     : Day5_27.py

def hammingDistance(x: int, y: int) -> int:
    print(bin(x), bin(y))
    res = x ^ y
    print(bin(res))
    cnt = 0
    while res:
        res = res & (res - 1)
        cnt += 1
    return cnt


print(hammingDistance(1, 4))
