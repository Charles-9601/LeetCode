"""
import math


def Is_prime(num):
    factor = int(math.sqrt(num))
    for i in range(2, factor+1):
        if num % i == 0:
            return False
    return True


def CountPrimes(num):
    count = 0
    for i in range(2, num):
        if Is_prime(i):
            count += 1
    return count
"""


def CountPrime(num):
    if num < 2:
        return 0

    isPrime = [1] * num
    isPrime[0] = isPrime[1] = 0

    for i in range(2, int(num ** 0.5) + 1):
        if isPrime[i]:
            isPrime[i * i:num:i] = [0] * ((num - 1 - i * i) // i + 1)
    return sum(isPrime)


def main():
    num = int(input('请输入一个正整数：'))
    print(CountPrime(num))


if __name__ == '__main__':
    main()
