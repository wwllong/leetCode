package primary.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Wwl
 * 两数之和:
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * 
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoSum {
	
	/* 思路三:利用HashMap进行判断和存储
	 * 20eg:7ms
	 * 可以先创建一个返回的数组,因为迟早需要返回结果
	 * */
	public int[] twoSum3(int[] nums,int target) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int x=0; x<nums.length; ++x) {
			if(!map.containsKey(target-nums[x])) {
				map.put(nums[x], x);
			}else {
				return new int[]{map.get(target-nums[x]),x};
			}
		}
		return null;
	}
	
	/* 思路二:优化遍历以及判断的次数 
	 * 20eg:24ms
	 * */
	public int[] twoSum2(int[] nums,int target) {
		for(int x=0; x<nums.length; ++x) {
			int temp = target - nums[x];
			for(int y=x+1; y<nums.length; ++y) {
				if(temp == nums[y]) {
					return new int[] {x,y};
				}
			}
		}
		return null;
	}
	
	/*思路一:普通遍历每个元素  
	* 20eg:97ms
	**/
	public int[] twoSum1(int[] nums,int target) {
		for(int x=0; x<nums.length; ++x) {
			for(int y=0; y<nums.length; ++y) {
				if(x==y) continue;
				if(nums[x] + nums[y] == target) {
					return new int[] {x,y};
				}
			}
		}
		return null;
	}
}
