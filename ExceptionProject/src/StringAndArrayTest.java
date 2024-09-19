
public class StringAndArrayTest {
	public static void main(String[] args) {
		
		//try {
			int ary[] = { 10,20,30 };
			System.out.println("array : "+ary[0]);
			System.out.println("array : "+ary[1]);
			System.out.println("array : "+ary[2]);
		//	System.out.println(">array : "+ary[3]);
		//}
		//catch(ArrayIndexOutOfBoundsException e) {
	//		System.out.println();
	//	}
		
		String str="Four Colours Private Limited";
		
		System.out.println("str : "+str.toUpperCase());
		System.out.println("str : "+str.toLowerCase());
		System.out.println("str 11th letter : "+str.charAt(11));
		System.out.println("str substring   : ["+str.substring(5, 15)+"]");
		
		System.out.println("END MAIN");
		
	}
}
