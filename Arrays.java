// import java.util.*;

// public class Arrays {
//     public static boolean containsDuplicate(int[] nums){
//         for(int i = 0; i < nums.length; i++){
//             for(int j = i+1; j<nums.length; j++){
//                 if(nums[i]==nums[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         int nums[] = {1,2,3,1};
//         System.out.println(containsDuplicate(nums));
//     }
// }




// import java.util.*;
// class Solution {
//     public int trap(int[] height) {
//         int n = height.length;
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for(int i = 1; i < n;  i++){
//             leftMax[i] = Math.max(height[i],leftMax[i-1]);
//         }
//         int rightMax[] = new int[n];
//         rightMax[n-1] = height[n-1];
//         for(int i = n-2; i >= 0; i--){
//             rightMax[i] = Math.max(height[i], rightMax[i+1]);
//         }
//         int trappedWater = 0;
//         for(int i = 0; i<n; i++){
//             int waterLevel = Math.min(leftMax[i], rightMax[i]);
//             trappedWater += waterLevel - height[i];
//         }
//         return trappedWater;
        
//     }
//     public static void main(String args[]){
//         Solution solution = new Solution();
//         int height[] = {4,2,0,3,2,5};
//         System.out.println(solution.trap(height));
//     }
// }




// class Solution {
//     public static int maxArea(int[] height) {
//         int max = 0;
//         int left = 0;
//         int right = height.length - 1;
//         while(left <= right){
//             int area = 0;
//             int length = Math.min(height[left], height[right]);
//             int breadth = Math.abs(left - right);
//             area = length * breadth;
//             max = Math.max(area,max);
//             if(height[left] <= height[right]){
//                 left++;
//             }else{
//                 right--;
//             }
//         }
//         return max;
//     }
//     public static void main(String args[]){
//         int height[] = {1,8,6,2,5,4,8,3,7};
//         int ans = Solution.maxArea(height);
//         System.out.println(ans);
//     }
// }


// class Arrays {
//     public static int searchInsert(int[] nums, int target) {
//         int start = 0, end = nums.length-1;
//         while(start <= end){
//             int mid = (start+end)/2;
//             if(nums[mid] == target){
//                 return mid;
//             }
//             if(nums[mid] < target){
//                 start = mid+1;
//             }else{
//                 end = mid-1;
//             }
//         }
//         return start;
//     }
//     public static void main(String args[]){
//         int nums[] = {1,3,5,6};
//         int target = 2;
//         System.out.println("index for key is :" + searchInsert(nums,target));
//     }
// }

// import java.util.*;
// class Arrays {
//     public static boolean searchMatrix(int[][] matrix, int target) {
//         int row = 0, col = matrix[0].length-1;
//         while(row < matrix.length && col >= 0){
//             if(matrix[row][col] == target){
//                 System.out.println("found target at("+ row +","+col+")");
//                 return true;
//             }
//             else if(target<matrix[row][col]){
//                 col--;
//             }else{
//                 row++;
//             }
//         }
//         System.out.println("target is not found");
//         return false;
//     }
//     public static void main(String args[]){
//         int matrix[][] = {{1,3,5,7},
//                           {10,11,16,20},
//                           {23,30,34,60}};
//         int target = 3;
//         searchMatrix(matrix,target);                  
//     }
// }