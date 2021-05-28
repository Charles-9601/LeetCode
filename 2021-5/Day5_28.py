# -*- coding: utf-8 -*-
# @Time     : 2021/5/28 23:40
# @Author   : 张其鹏
# @File     : Day5_28.py
def totalHammingDistance(nums: list[int]) -> int:
    sum_hamming = 0
    for i in range(0, len(nums)):
        for j in range(i + 1, len(nums)):
            print('i=', i, 'j=', j)
            print('nums[i], nums[j]', nums[i], nums[j])
            sum_hamming += hammingDistance(nums[i], nums[j])
            print('sum_hamming=', sum_hamming)
    return sum_hamming


def hammingDistance(x: int, y: int) -> int:
    # print(bin(x), bin(y))
    res = x ^ y
    return bin(res).count('1')
    # print(bin(res))
    # cnt = 0
    # while res:
    #    res = res & (res - 1)
    #    cnt += 1
    # return cnt


print(totalHammingDistance([4, 14, 2]))
# print(hammingDistance(4, 14))
