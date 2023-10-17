package RamAssignment;
import java.util.*;
public class HashMaps {
	    public static int[] twoSum(int[] nums, int target) {
	        Map<Integer, Integer> numToIndex = new HashMap<>();
	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];
	            if (numToIndex.containsKey(complement)) {
	                return new int[] { numToIndex.get(complement), i };
	            }
	            numToIndex.put(nums[i], i);
	        }
	        throw new IllegalArgumentException("No two sum solution");
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        int[] nums = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            nums[i] = scanner.nextInt();
	        }

	        System.out.print("Enter the target sum: ");
	        int target = scanner.nextInt();

	        int[] result = twoSum(nums, target);
	        System.out.println("Indices of the two numbers that add up to the target: " + result[0] + " and " + result[1]);

	        scanner.close();
	    }
	}


