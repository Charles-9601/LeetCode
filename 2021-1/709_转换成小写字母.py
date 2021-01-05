def toLowerCase(word):
    """
    return word.lower()  内置函数
    'A' - 'Z' ascii 65 - 90
    'a' - 'z' ascii 97 - 122
    """
    words = []
    for i in word:
        if 65 <= ord(i) <= 90:
            words.append(chr(ord(i) + 32))
        else:
            words.append(i)
    return ''.join(words)


def main():
    str1 = 'HELLO'
    str2 = 'WORD'
    str3 = 'Hello'
    print(toLowerCase(str1))
    print(toLowerCase(str2))
    print(toLowerCase(str3))


if __name__ == '__main__':
    main()
