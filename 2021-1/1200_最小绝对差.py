list_1 = [4, 2, 1, 3]


def minimumAbsDifference(arr):
    arr.sort()
    """
    sort    永久排序    list_1.sort()
    sorted  临时排序    sorted(arr)
    """
    list_2 = []
    min_diff = arr[1] - arr[0]
    for i in range(1, len(arr)):
        min_diff = min(min_diff, (arr[i] - arr[i - 1]))

    for i in range(1, len(arr)):
        if min_diff == (arr[i] - arr[i - 1]):
            list_2.append([arr[i - 1], arr[i]])
    return list_2


print(minimumAbsDifference(list_1))
