# 383 赎金信
from collections import Counter


def canConstruct(ransomNote: str, magazine: str) -> bool:
    count_ran = Counter(ransomNote)
    # print(count_ran)
    count_mag = Counter(magazine)
    # print(count_mag)
    for a in count_ran:
        if count_ran[a] > count_mag[a]:
            return False
    return True


print(canConstruct('aa', 'aab'))
