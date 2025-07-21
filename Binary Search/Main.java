// 二分查找是基础的算法之一，但是你能保证每次都写的很general么？

// 第一版本
public int findPeakElement(int[] nums) {
    int n = nums.length;
    int a = 0, b = n - 1;
    while (a < b) {
        int mid = a + (b - a) / 2;
        if (nums[mid] < nums[mid + 1])
            a = mid + 1;
        else
            b = mid;
    }
    return a;
}
