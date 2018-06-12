package primary.arrays;

import java.util.Arrays;

/**
 * @author Wwl
 * 旋转数组
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 			  [1,2,3,4,5,6,7]
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 *  尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 *  要求使用空间复杂度为 O(1) 的原地算法。
 *  
 */
public class Rotate {

	//思路4：在思路2的基础上，不使用辅助数组 ！
	/* 依旧 (index+k)%arr.length，定位到移动结果，调换之后，后一个调换基于上一个的位置
	 * 例如：[1,2,3,4,5,6,7] k=1
	 * 1
	 * 1 2 3 4 5 6 7
	 * 
	 *   2		     
	 * 1 1 3 4 5 6 7  
	 * 
	 *     3
	 * 1 1 2 4 5 6 7
	 * 
	 * ....
	 * 
	 *             7
	 * 1 1 2 3 4 5 6  
	 * 
	 * 1
	 * 7 1 2 3 4 5 6  
	 * 
	 * 需要注意的是：进行调换后，对待调换值更新的控制：
	 * 	在数组长度为奇数的情况下，调换后直接进行待调换值的更新没有任何问题，因为确保了每次调换后，都是有确定未调换的位置
	 *  但是在数组长度为偶数情况下，会出现重复替换的情况，如：
	 *  {1,2,3,4,5,6}, 2  --》3,2,1,4,1,6   (true：5,6,1,2,3,4)
	 *  1
	 *  1 2 3 4 5 6
	 *  
	 *      3
	 *  1 2 1 4 5 6
	 *  
	 *          5
	 *  1 2 1 4 3 6 //此处应该做出处理 因为下一个替换index=0 ，跳过更新cur为temp ，而进行更新为下一个index++
	 *  
	 *  1
	 *  5 2 1 4 3 6 //错误的开始
	 *  
	 *      1 
	 *  5 2 1 4 3 6 //在此处出现了问题：出现了调换覆盖
	 *  
	 *          3
	 *  5 2 1 4 1 6
	 *  
	 *  5
	 *  3 2 1 4 1 6
	 *  
	 *  总结：数组长度为奇数情况下，该方法不会出现问题，
	 *  偶数情况下，出现的重复替换的原因是k %= nums.length导致的
	 *  处理方法是，判断index==start（0）情况下，更新start++，index++
	 *  将要更新的位，更新位nums[index]
	 * 
	 * */
	public static int[] rotate4(int[] nums, int k) {
	    if (nums.length == 0 || (k %= nums.length) == 0) {
	        return nums;
	    }
	    int index = 0;
	    int length = nums.length;
	    int temp = 0;
	    int cur = nums[0];
	    
	    for(int count=0,start=0; count<length; ++count) {
	    	index = (index+k) % length;//waring
	    	temp = nums[index];
	    	nums[index] = cur;
	    	if(index==start) {
	    		++start;
	    		++index;
	    		cur = nums[index];
	    	}else {
	    		cur = temp;
	    	}
	    	
	    }
	    return nums;
	    /* while实现
	    int length = nums.length;
	    int start = 0;
	    int i = 0; //index
	    int cur = nums[i];//待移动（调换）的值
	    int count = 0; //计数器

	    //对数组的每个元素进行一次替换
	    while (count++ < length) { 
	        i = (i + k) % length;
	        int t = nums[i]; //存储下一个待调换的值
	        nums[i] = cur; //调换
	        //update cur
	        if (i == start) { 
	            ++start;
	            ++i;
	            cur = nums[i];
	        } else {
	            cur = t; 
	        }
	       
	    }*/
	}
	
	//思路3：采用反转的方法，向反转前n-k个元素，在反转后n-k个元素，最后反转整个数组  --此效率最高
	/*	
	 * [1,2,3,4,5,6,7] k = 3 					k=1
	 * 反转前n-k个元素：7-3-1=3 [4,3,2,1,5,6,7]     6 5 4 3 2 1 7
	 * 反转后k个元素： [4,3,2,1,7,6,5]				7 1 2 3 4 5 6 
	 * 反转整个数组：[5,6,7,1,2,3,4]
	 * [5,6,7,1,2,3,4]
	 * */
	public static int[] rotate3(int[] arr,int k) {
		if(k<0) return arr;
		int len = arr.length;
		k = k%len;
		reverse(arr,0,len-1-k);
		reverse(arr,len-k,len-1);
		reverse(arr,0,len-1);
		return arr;
	}
	
	private static void reverse(int[] arr,int start,int end) {
		int temp = 0;
		while(start < end) {
			temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
		}

	}
	
	//思路2：在思路1的基础上，破解循环嵌套--虽然通过测试，但是该方法使用了辅助数组，不符合原地
	/*	根据 (index+k)%arr.length，直接定位到移动结果
	 * [1,2,3,4,5,6,7] k = 3 
	 * index = 0  (index+3)%arr.length=3  1移动到arr[3]
	 * index = 6  (index+3)%arr.length=2  7移动到arr[2]
	 * [5,6,7,1,2,3,4]
	 * */
	public static int[] rotate2(int[] arr, int k) {
		if(k<0||arr==null) return arr;
		
		int length = arr.length,index = 0;
		k = k%length;
		int[] copy_arr = arr.clone();
		
		for(int x=0; x<length; ++x) {
			index = (x+k)%length;
			arr[index] = copy_arr[x];
		}
		return arr;
//		System.out.println(Arrays.toString(arr));
	}

	//思路1：根据K进行循环，每次循环数组每位移动一步
	/* 数组完成依次向后移动一位的操作思路：
	 *  temp 记录下次进行移动的数  
	 *  遍历 从index=1开始遍历，就是应该替换位temp的位置
	 *  arr[0] 作为中转，用来更新temp
	 *  
	 *  该算法 超过了时间的限制 ！！因为数组/k很大的时候，循环太暴力。
	 * */
	public static int[] rotate1(int[] arr, int k) {
		if(k<0||arr==null) return arr;
		int i = 0;
		
		int temp = arr[0]; //起始移动值
		while(i<k) {
			for(int x=1; x<arr.length; ++x) {
				arr[0] = arr[x];
				arr[x] = temp;
				temp = arr[0]; //更新向后移动的值
			}
			++i;
		}
		
		//System.out.println(Arrays.toString(arr));
		return arr;
	}
	

}
