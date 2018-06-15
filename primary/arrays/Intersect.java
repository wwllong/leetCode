package primary.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Wwl 给定两个数组，写一个方法来计算它们的交集。
 *
 *         例如:给定 nums1 = [1, 2, 2, 1], nums2 = [2, 2], 返回 [2, 2]. 注意：
 *         输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。 我们可以不考虑输出结果的顺序。
 * 
 *         跟进: 如果给定的数组已经排好序呢？你将如何优化你的算法？ 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 *         如果nums2的元素存储在磁盘上，内存是有限的，你不能一次加载所有的元素到内存中，你该怎么办？
 */
public class Intersect {

	// 优化方法2 -3ms
	public int[] intersect3(int[] nums1, int[] nums2) {

		int len1 = nums1.length;
		int len2 = nums2.length;
		Arrays.sort(nums1);
		Arrays.sort(nums2);

		int[] result = new int[Math.max(len1, len2)];
		int i = 0, j = 0, c = 0;
		while (i < len1 && j < len2) {
			if (nums1[i] == nums2[j]) {
				result[c++] = nums1[i];
				++i;
				++j;
			} else if (nums1[i] > nums2[j]) {
				++j;
			} else {
				++i;
			}
		}

		if (c > 0)
			return Arrays.copyOf(result, c);
		else
			return new int[0];

	}

	/*
	 * 给两个数组排序，然后用两个索引分别代表两个数组的起始位置， 如果两个索引所代表的数字相等，则将数字存入结果中，两个索引均自增1，
	 * 如果第一个索引所代表的数字大，则第二个索引自增1，反之亦然。 4ms
	 */
	public int[] intersect2(int[] nums1, int[] nums2) {

		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int len1 = nums1.length;
		int len2 = nums2.length;
		int i = 0, j = 0;
		List<Integer> list = new ArrayList<>();
		while (i < len1 && j < len2) {
			if (nums1[i] == nums2[j]) {
				list.add(nums1[i]);
				++i;
				++j;
			} else if (nums1[i] > nums2[j]) {
				++j;
			} else if (nums1[i] < nums2[j]) {
				++i;
			}
		}

		int[] result = new int[list.size()];
		int k = 0;
		for (Integer i1 : list) {
			result[k++] = i1;
		}
		return result;

	}

	/*
	 * 用Map来建立nums1中字符和其出现个数之间的映射, 然后遍历nums2数组，
	 * 如果当前字符在Map中的个数大于0，则将此字符加入结果res中，然后Map的对应值自减1。 7ms
	 */
	public int[] intersect1(int[] nums1, int[] nums2) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int n1 : nums1) {
			Integer value = map.get(n1);
			map.put(n1, (value == null ? 0 : value) + 1);
		}

		List<Integer> list = new ArrayList<>();
		for (int n2 : nums2) {
			if (map.containsKey(n2) && map.get(n2) > 0) {
				list.add(n2);
				map.put(n2, map.get(n2) - 1);
			}
		}

		int[] result = new int[list.size()];
		int x = 0;
		for (Integer i : list) {
			result[x++] = i;
		}
		return result;
	}

}
