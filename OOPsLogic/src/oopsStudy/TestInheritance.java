package oopsStudy;

public class TestInheritance {

	public static void main(String[] args) {
	
		
		Inheritance inth = new Inheritance();
		inth.getname("Mahes1234");
		int age = inth.getage();
		String NA = inth.getNameAge();
		String Name = inth.getOriginalname();
		
		System.out.println(age);
		System.out.println(NA);
		System.out.println(Name);
	}

}