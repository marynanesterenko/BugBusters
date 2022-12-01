package UserStories_Array;
/*
Given an int array length 2, return true if it does not contain a 2 or 3.

Example:
no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
 */

public class no23 {
    public static void main(String[] args) {
        int[] nums = {4,4};
        System.out.println(no23(nums));

    }

    // TO DO:
    // uncomment the lines below and write your method to solve this Task:


     public static boolean no23(int[] nums) {
         for (int i = 0; i < nums.length; i++) {
             if (nums[i] == 2 || nums[i] == 3) {
                 return false;
             } else {
                 return true;
             }
         }
         return false;
     }
 }



