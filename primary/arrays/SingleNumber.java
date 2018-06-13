package primary.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * @author Wwl
 * 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * 示例 1:
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 * 输入: [4,1,2,1,2]
 * 输出: 4
 * 
 * 执行用时：3<4<2<1
 */
public class SingleNumber {
	//思路5：依旧利用^的特性
	
	//思路4：数组排序，遍历判断，通过置空和更新值，确定最后的值 -10ms
	public int singleNumber4(int[] nums) {
		if(nums.length==1) return nums[0];
		Arrays.sort(nums);
		Integer cur = null;
		for(int x=0; x<nums.length; ++x) {
			if(cur==null) {
				cur = nums[x];
			}else if(cur.equals(nums[x])) {
				cur = null;
			}
		}
		return cur;
	}
	
	//思路3：添加健壮性判断返回，根据数组限定，利用^运算的特性-13ms 去掉前两个语句后 -1ms
	public int singleNumber3(int[] nums) {
		//if(nums.length==1) return nums[0];
		//Arrays.sort(nums);
		int n = nums[0];
		for(int x=1; x<nums.length; ++x) {
			n = n ^ nums[x];
		}
		return n;
	}
	
	//思路2：对数组进行排序，利用重复元素位2的特性，进行遍历 -16ms
	public int singleNumber2(int[] nums) {
		Arrays.sort(nums);
		
		for(int x=0; x<nums.length-1; ) {
			if(nums[x]==nums[x+1]) {
				x+=2;
			}else {
				return nums[x];
			}
		}
		return nums[nums.length-1];
	}
	
	//思路1：使用Map特性 -20ms
	public int singleNumber1(int[] nums) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int single = 0;
		for(int num : nums) {
			if(!map.containsKey(num)) {
				map.put(num, 1);
			}else {
				map.put(num, 2);
			}
		}
		for(int num:nums) {
			if(map.get(num)==1) 
				single = num;
		}
		return single;
	}
}
