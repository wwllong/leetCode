package primary.arrays;

/**
 * @author Wwl
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *  必须在原数组上操作，不能拷贝额外的数组。
 *  尽量减少操作次数。
 */
public class MoveZeroes {
	/*
	 * 思路二:
	 * 仔细分析数组的元素:0与非0.保持非0元素的原始顺序
	 * 使用两个指针,一个指向值非0的数,一个指向数组的起始
	 * 遍历数组,找到第一个非0的值,依次与起始指针进行交换
	 * 直到遍历完数组
	 * 21eg:3ms
	 * */
	public int[] moveZeroes2(int[] nums) {
		for(int nonZero=0,index=0; nonZero<nums.length; ++nonZero) {
			if(nums[nonZero]!=0) {
				swap(nums,index,nonZero);
				index++;
			}
		}
		return nums;
	}
	
	/* 思路1：
	 * 0 1 0 3 12
	 * 1 0 3 12 0
	 * 1 3 12 0 0
	 * 冒泡排序改进
	 * 循环遍历元素，当元素为0，从该元素进行冒泡
	 * 冒泡结束，从新进行0开始遍历茶查找0元素。
	 * 从零遍历次数应该为length-1-zerose
	 * 21eg:36ms
	 * */
	public int[] moveZeroes1(int[] nums) {
		int zeroes = 0;
		for(int x=0; x<nums.length-1-zeroes; ++x) {
			if(nums[x] != 0 ) {
				continue;
			}else {
				for(int y=x; y<nums.length-zeroes-1; ++y) {
					swap(nums,y,y+1);
				}
				++zeroes;
				if(nums[x]==0) --x; //防止一次冒泡之后,前进的值0
			}
		}
		return nums;
	}
	
	public void swap(int[] nums,int a,int b) {
		int temp = nums[a];
		nums[a] = nums[b]; 
		nums[b] = temp;
	}
}
