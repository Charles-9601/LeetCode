def sumOddLengthSubarrays(arr):
    i, count = 1, 0
    while i <= len(arr):
        for j in range(len(arr) - i + 1):
            count += sum(arr[j:j + i])
        i += 2
    return count


def main():
    arr = [1, 4, 2, 5, 3]
    print(sumOddLengthSubarrays(arr))


if __name__ == '__main__':
    main()
