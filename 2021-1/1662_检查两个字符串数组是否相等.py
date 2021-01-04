def arrayStringAreEqual(str1, str2):
    if ''.join(str1) == ''.join(str2):
        return True
    else:
        return False


def main():
    word1 = 'hangman'
    word2 = 'zhangsan'
    print(arrayStringAreEqual(word1, word2))


if __name__ == '__main__':
    main()
