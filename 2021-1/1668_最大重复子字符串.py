def maxRepeating(sequence, word):
    count = 0
    while word * (count + 1) in sequence:
        count += 1
    return count


def main():
    sequence = "ababc"
    word = 'ab'
    count = maxRepeating(sequence, word)
    print(count)


if __name__ == '__main__':
    main()