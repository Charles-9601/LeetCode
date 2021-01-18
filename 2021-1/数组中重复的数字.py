"""输入：
[2, 3, 1, 0, 2, 5, 3]
输出：2 或 3
"""


def findRepeatNumber(nums):
    len_nums = len(nums)
    temp = 0
    for i in range(len_nums):
        while nums[i] != i:
            if nums[i] == nums[nums[i]]:
                return nums[i]
            temp = nums[i]
            nums[i] = nums[temp]
            nums[temp] = temp
    return False


print(findRepeatNumber([2, 3, 1, 0, 2, 5, 3]))
