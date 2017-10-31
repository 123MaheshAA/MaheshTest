package oopsStudy;

public class Inheritance {
	
	String name ="Mahesh";

	int age =20;
	
	public void name(){
		System.out.println(Inheritance.this);
		
	}
	
	public void getname(String name){
		this.name= name;
	}
	
	
	public int getage(){
		return age;
	}

	
	public String getNameAge(){
		String nameage = name+ "-->"+age;
		return nameage;
	}
	
	public String getOriginalname(){
		return name;
	}
}
