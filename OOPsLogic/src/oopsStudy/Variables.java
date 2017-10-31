package oopsStudy;

public class Variables {
	
	static int a = 10;  // Static variable
	
	int b =20;   // Default variable and can be accessed in any class within package
	public String name = "Mahesh"; //Can be accessed anywhere across any class or package.
	protected static int id =12; // can be accessed within the package and subclass by directly not through object
	final int order = 500;
	static int order1 =600;
	
	/*=======================Instance Variables=================
	 * int a=10;
	 * int b=23;
	 *  
	 */
	
	static void test1(){
		System.out.println(Variables.a);
			
	}
	
	
	
	static String test2(String name){
		//System.out.println(location);
				String loc1= name+"--->"+"Mahesh"+Variables.a+Variables.order1;
		return loc1;
		}
	
	
	static void test3(){
		System.out.println("Test is Passed");
	}
	
	
	public static void main(String[] arg){
		System.out.println(Variables.a);
		Variables aa= new Variables();
		System.out.println(aa.name);
		System.out.println(Variables.id);
		//String bbS = bb.test2();
		//System.out.println(bbS);
		System.out.println(Variables.test2("NUMBER"));
		System.out.println(aa.equals("aa"));
	}
	
	
	
	public static void main2(String[] arg){
		
	}

}
