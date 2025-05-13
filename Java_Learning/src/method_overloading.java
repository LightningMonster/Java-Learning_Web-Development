
public class method_overloading {

	public static void main(String[] args) {
		
		String name = "Yash Dhadve";
		int num = 829384922;
		String add = "efdngdjkfngdfkj";
		
		profile(name,num,add);
		
		String name1 = "Yash Dhadve";
		float num1 = 829384922;
		String add1 = "efdngdjkfngdfkj";
		
		profile(name1,num1,add1);
	}

	public static void profile(String name, int num, String add) {
		System.out.println(name+" "+num+" "+add);
	}
	
	public static void profile(String name, float num, String add) {
		System.out.println(name+" "+num+" "+add);
	}
}
