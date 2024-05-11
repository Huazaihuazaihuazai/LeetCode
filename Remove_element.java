package day_01;
//27.移除元素
//给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
//
//不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
//
//元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
//示例 1：
//
//输入：nums = [3,2,2,3], val = 3
//输出：2, nums = [2,2]
//解释：函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。你不需要考虑数组中超出新长度后面的元素。例如，函数返回的新长度为 2 ，而 nums = [2,2,3,3] 或 nums = [2,2,0,0]，也会被视作正确答案。
//示例 2：
//
//输入：nums = [0,1,2,2,3,0,4,2], val = 2
//输出：5, nums = [0,1,3,0,4]
//解释：函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。注意这五个元素可为任意顺序。你不需要考虑数组中超出新长度后面的元素。
public class Remove_element {
    public static void main(String[] args) {

    }
//    自己写的解法：两个相互奔赴的指针，交换位置
    public static int removeElement(int[] nums, int val) {
        int right=nums.length-1;
        int count=0;
        int num=nums.length;
        for (int i = 0; i < nums.length; i++) {
            if(i>right){
                num=nums.length-count;
                break;
            }
            int temp=nums[i];
            if(temp==val){
               nums[i]=nums[right];
               nums[right]=temp;
               count++;
               i--;
               right--;
            }
        }
        return num;
    }
//    快慢指针的方法：快指针指的是要存的数，慢指针指的是要存的位置//erase
public static int removeElement1(int[] nums, int val) {
    int slow=0;
    for (int fast = 0; fast < nums.length; fast++) {
        if (nums[fast]!=val){
            nums[slow]=nums[fast];
            slow++;
        }
    }
    return slow;
    }

}
