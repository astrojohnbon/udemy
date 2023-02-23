package practice.loops;

public class LoopsPractice {

	public static void main(String[] args) {
		
	String str = "We have a large inventory of things in our warehouse falling in "
	+ "the category:apparel and the slightly "
	+ "more in demand category:makeup along with the category:furniture and  ";
		
	int a = str.indexOf("category:apparel");
	System.out.println(a);
	
	int b = str.indexOf("category:makeup");
	System.out.println(b);
	
	int c = str.indexOf("category:furniture");
	System.out.println(c);
	
	
	System.out.println(str.substring(68, 85));
	
	System.out.println(str.substring(117, 132));	
	
	System.out.println(str.substring(148, 166));
	
	
	
	printCategories(str);
	
	}
	
	//extract all categories from the string argument

	public static void printCategories(String string) {
		int i = 0;
		while(true) {
			int found = string.indexOf("category:", i);
			if(found == -1) break;
			int start = found + 9; // start of actual category / string
			int end = string.indexOf(" ", start);
			System.out.println(string.substring(start, end));
			i = end + 1;
			}
	}
}
