def reverseWords(words):
    words = words.strip()  # 删除首尾的空格
    i = j = len(words) - 1
    res = []
    while i >= 0:
        while i >= 0 and words[i] != ' ':
            i -= 1
        res.append(words[i + 1:j + 1])
        while words[i] == ' ':
            i -= 1
            j = i
    return ' '.join(res)


def main():
    words = 'the sky is blue'
    word = reverseWords(words)
    print(word)


if __name__ == '__main__':
    main()
