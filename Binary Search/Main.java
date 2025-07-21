// 二分查找是基础的算法之一，但是你能保证每次都写的很general么？

// 第一版本(7/20/25)
public int binarySearch(int[] nums, int target) {
    int n = nums.length;
    int a = 0, b = n - 1;
    while (a < b) {
        int mid = a + (b - a) / 2;
        if (nums[mid] < target)
            a = mid + 1;
        else
            b = mid;
    }
    return a;
}

// 第二版本(7/21/25)
/*
上一个版本是通用解法，但是如果有这样一种情况:
一个数组arr = [2,3,4,4,4,5,6], target = 4，让你找到数组里值为target的左右两边的index，那上一个版本就只能解决一半问题。
在上面的版本，line 8：mid = a + (b - a) / 2，可以知道mid是向下取整。所以上面的版本会找到满足条件的最左边index，下一个版本是求出满足条件的最右面的index
*/
// 两种解法
/*
    1. 找到最右边的index，但是需要额外判断
    由于在line:36 a = mid + 1，所以有可能跳出循环之后a == b但是nums[b(a)] > target(这种情况会在只有数组只有一个target情况下发生)，所以需要额外判断(line:40-43)
*/
public int binarySearch(int[] nums, int target) {
    int n = nums.length;
    int a = 0, b = n - 1;
    while (a < b) {
        int mid = a + (b - a) / 2;
        if (nums[mid] > target) {
            b = mid;
        } else {
            a = mid + 1;
        }
    }
    if (nums[b] == target)
        res[1] = b;
    else
        res[1] = b - 1;
}

/*
    2. 找到最左边的第一个比target大的index，不需要额外判断
*/
public int binarySearch(int[] nums, int target) {
    int n = nums.length;
    int a = 0, b = n - 1;
    while (a < b) {
        int mid = a + (b - a) / 2;
        if (nums[mid + 1] > target) {
            b = mid;
        } else {
            a = mid + 1;
        }
    }
}









