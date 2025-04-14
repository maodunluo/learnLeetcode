package com.yyc.learnleetcode.learnalgorithms.a215;

public class Solution {

  public int findKthLargest(int[] nums, int k) {
    heapify(nums);
    final int n = nums.length;
    for (int i = n -1 ; i >= n - k + 1; i--) {
      swap(nums, 0, i);
      heapify(nums, i, 0);
    }
    return nums[0];
  }

  private int[] heapify(int [] nums) {
    //将nums转化为大顶堆
    final int n = nums.length;
    for (int i = n / 2 -1 ; i >= 0 ; i--) {
      heapify(nums, n, i);
    }
    return nums;
  }

  private void heapify(int[] nums, int n, int i) {
    int largest = i;
    int left = i * 2 + 1;
    int right = i * 2 + 2;
    if (left < n && nums[left] > nums[largest]) {
      largest = left;
    }
    if (right < n && nums[right] > nums[largest]) {
      largest = right;
    }
    if (largest != i) {
      swap(nums, i, largest);
      heapify(nums, n, largest);
    }
  }

  private void swap(int[] arr, int i ,int largest) {
    int t = arr[i];
    arr[i] = arr[largest];
    arr[largest] = t;
  }

}
