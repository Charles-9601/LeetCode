# 692 前K个高频单词
import collections


def topKFrequent(words: list[str], k: int) -> list[str]:
    list_count = collections.Counter(words)
    res = sorted(list_count, key=lambda word: (-list_count[word], word))
    return res[:k]


