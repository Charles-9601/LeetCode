# -*- coding: utf-8 -*-
# @Time     : 2021/5/29 00:43
# @Author   : 张其鹏
# @File     : Day5_29.py
def numSubmatrixSumTarget(matrix: list[list[int]], target: int) -> int:
    # 提取矩阵的长和宽
    m = len(matrix)
    n = len(matrix[0])
    # 初始化子矩阵的个数
    count = 0
    # 前两层循环通过i和j来固定矩形的始末行
    for i in range(m):
        sum_item = [0] * n
        for j in range(i, m):
            # s用来记录每个矩形的前k个竖直长条的累加和
            s = 0
            # 初始化哈希表，因为遍历到第一个长条时s为0，所以将0出现的个数初始化为1
            dct = dict()
            dct[0] = 1
            # 遍历n列，也就是n个长条，sum_item用来存放每个竖直长条的累加和
            # 如果s - target在哈希表中，则s - target = x，等价于s - x = target，
            # 其中s为当前k个长条累加和，x为之前x个长条的累加和，等式成立说明(k-x)区间内的长条累加和等于target
            # 于是count+1
            for k in range(n):
                sum_item[k] += matrix[j][k]
                s += sum_item[k]
                count += dct.get(s - target, 0)
                dct[s] = dct[s] + 1 if s in dct else 1
    return count


print(numSubmatrixSumTarget([[0, 1, 0], [1, 1, 1], [0, 1, 0]], 0))