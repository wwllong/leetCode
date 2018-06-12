package primary.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Wwl
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * 输入: [1,2,3,1]
 * 输出: true
 * 
 * 输入: [1,2,3,4]
 * 输出: false
 * 
 * 效率：method5>method2>method3/method4>method1
 */
public class ContainsDuplicate {
	
	//思路5：在思路的1的基础上改进，往前进行判断-可以有效减少遍历
	//向前判断过程进行了一个大小判读，减少判断相等的次数
	public boolean containsDuplicate5(int[] nums) {
		 if (nums.length < 2) return false; 
		 
		 for (int i = 1; i < nums.length; i++) {
			 for (int j = i - 1; j >= 0; j--) {
				 if(nums[i] > nums[j] )break; //少了这句效率大打折扣
	             if(nums[i] == nums[j])return true;
	         }
		 }
	     return false;
	}
	
	//思路4:利用Set集合的元素唯一
	public boolean containsDuplicate4(int[] nums) {
		if(nums.length<2) return false;
		System.out.println(Arrays.toString(nums));
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		Set<Integer>  set = new HashSet<Integer>();
		for(int num : nums) {
			if(!set.add(num))
				return true;
		}
		
		return false;
	}
	
	//思路3：利用Map进行比较
	public boolean containsDuplicate3(int[] nums) {
		if(nums.length<2) return false;
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		Arrays.sort(nums);
		
		for(int num : nums) {
			if(map.get(num)!=null) {
				return true;
			}else {
				map.put(num, "");
			}
		}
		
		return false;
	}
	
	
	//思路2：对数组进行排序，相邻比较
	public boolean containsDuplicate2(int[] nums) {
		if(nums==null) return false;
		Arrays.sort(nums);
		for(int x=0; x<nums.length-1; ++x) {
			if(nums[x]==nums[x+1])return true;
		}
		return false;
	}
	
	//思路1:逐个比较
	public boolean containsDuplicate1(int[] nums) {
		if(nums==null) return false;
		for(int x=0; x<nums.length; ++x) {
			for(int y=x+1; y<nums.length; ++y) 
				if(nums[x]==nums[y])return true;
		}
		return false;
    }
}
