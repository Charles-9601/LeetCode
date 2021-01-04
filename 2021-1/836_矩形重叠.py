def isRectangleOverlap(rec1, rec2):
    x1 = max(rec1[0], rec2[0])
    y1 = max(rec1[1], rec2[1])

    x2 = min(rec1[2], rec2[2])
    y2 = min(rec1[3], rec2[3])

    if x1 < x2 and y1 < y2:
        return True
    else:
        return False


def main():
    rec1 = [0, 0, 2, 2]
    rec2 = [1, 1, 3, 3]
    print(isRectangleOverlap(rec1, rec2))


if __name__ == '__main__':
    main()