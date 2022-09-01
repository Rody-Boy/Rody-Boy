class father {
	String appearance="handsome";
	String behavior="well behaved";
	String talents="singing and dancing";
	String skills="carpentry, basic appliance repairs";
	void sing() {
		System.out.println("lalalala");
	}
}
class son extends father{
	
}

class daughter extends father{
	String appearance1="beautiful";
}



public class inheritance {
	public static void main(String[] args) {
		son s=new son();
		System.out.println("the son is also "+s.appearance);
		System.out.println("the son is also "+s.behavior);
		s.sing();
		System.out.println("the son have skills like his father in " +s.skills);
		
		System.out.println();
		
		
		daughter d=new daughter();
		System.out.println("the daughter is not "+(d.appearance)+" because she is "+(d.appearance1));
		System.out.println("the daughter however inherits the talents of his father which are "+d.talents);
	}
}