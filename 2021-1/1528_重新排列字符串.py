def restoreString(word, indices):
    res = ["" for i in range(len(word))]
    for i in range(len(word)):
        res[indices[i]] = word[i]
    return "".join(res)


def main():
    word = 'aiohn'
    indices = [3, 1, 4, 2, 0]
    print(restoreString(word, indices))
    word1 = "codeleet"
    indices1 = [4, 5, 6, 7, 0, 2, 1, 3]
    print(restoreString(word1, indices1))


if __name__ == '__main__':
    main()
