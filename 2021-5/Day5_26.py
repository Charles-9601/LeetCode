# -*- coding: utf-8 -*-
# @Time     : 2021/5/26 00:11
# @Author   : 张其鹏
# @File     : Day5_26.py

# 1190 反转每对括号间的子串
"""
s = "(u(love)i)"说明题意，看它如何变成iloveu!
反转最内层，再去掉最内层括号，(u(love)i) 变成 (uevoli)
反转第二层，再去掉第二层括号 (uevoli)变成iloveu
"""


def reverseParentheses(s: str) -> str:
    stack = []
    for c in s:
        if c != ')':
            stack.append(c)  # 左括号or字母入栈
        elif c == ')':
            temp = []  # 临时列表 用于保存反转后子串
            while stack and stack[-1] != '(':
                temp.append(stack.pop())
            stack.pop()  # 左括号弹出
            stack += temp
    return ''.join(stack)
