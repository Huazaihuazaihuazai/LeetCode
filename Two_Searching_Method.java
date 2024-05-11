package day_01;

//LeetCode704.二分查找
//给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
//
//
//示例 1:
//
//输入: nums = [-1,0,3,5,9,12], target = 9
//输出: 4
//解释: 9 出现在 nums 中并且下标为 4
//示例 2:
//
//输入: nums = [-1,0,3,5,9,12], target = 2
//输出: -1
//解释: 2 不存在 nums 中因此返回 -1
public class Two_Searching_Method {
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        int target=9;
        System.out.println(search(nums, target));
    }
//    左闭右闭区间写法[left,right]
    public static int search(int[] nums, int target) {
        int length=nums.length;
        int left=0;
        int right=length-1;
        int middle=(left+right)/2;
        while (left<=right){
            if (nums[middle]<target){
                left=middle+1;
            } else if (nums[middle]>target) {
                right=middle-1;
            }else {
                return middle;
            }
            middle=(left+right)/2;
        }
        return -1;
    }
//    左闭右开区间写法
    public static int search2(int[] nums, int target) {
        int length=nums.length;
        int left=0;
//        right不同
        int right=length;
        int middle=(left+right)/2;
//        结束条件不同
        while (left<right){
            if (nums[middle]<target){
                left=middle+1;
            } else if (nums[middle]>target) {
//                右区间更新不同
                right=middle;
            }else {
                return middle;
            }
            middle=(left+right)/2;
        }
        return -1;
    }
}
