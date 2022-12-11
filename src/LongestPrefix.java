
public class LongestPrefix {
public static void main(String[] args) {
	String[] strs= {"abc","ab","ab"};
	String prefix=strs[0];
	
	for(int i=1;i<strs.length;i++) {
			if(strs[i].indexOf(prefix)!=0) {
				prefix=prefix.substring(0, prefix.length()-1);
			}
	}
	System.out.println(prefix);
	}
}
