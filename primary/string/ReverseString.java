package primary.string;

/**
 * @author Wwl
 * 反转字符串
 */
public class ReverseString {
	//2ms
	 public String reverseString(String s) {
		 char[] cArr = s.toCharArray();
		 for (int i = 0,j = cArr.length-1; i < j; ++i,--j) {
			char temp = cArr[i];
			cArr[i] = cArr[j];
			cArr[j] = temp;
		}
		 return new String(cArr);
	 }
	 
	 //4ms
	 public String reverseString2(String s) {
		 char[] cArr = s.toCharArray();
		 StringBuilder sb = new StringBuilder();
		 for (int i = cArr.length-1; i >=0 ; --i) {
			sb.append(cArr[i]);
		 }
		 return sb.toString();
	 }
	 
	 //3ms
	 public String reverseString3(String s) {
		return new StringBuilder(s).reverse().toString();
	 }
}
