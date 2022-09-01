class animal {
	void eat() {
		System.out.println("namnamnam");
	}
	void sleep() {
		System.out.println("Zzzzzzz");
	}
	void play() {
		System.out.println("*jumps and runs*");
	}
}

class dog extends animal{
	String type="canine";
	void bark() {
		System.out.println("aw aw aw");
	}
}

//dog

class germanShepherd extends dog{
	String size="65 cm";
	String color="black and brown";	
}

class pug extends dog{
	String size="33cm";
	String color="light brown";
}


class cat extends animal{
	String type="feline";
	void meow() {
		System.out.println("Meooooww");
	}
}
//cats

class persian extends cat{
	String size="15 inches";
	String color="orange";
}

class ragdoll extends cat{
	String size="17 inches";
	String color="white, black , brown";
}

class bird extends animal{
	String type="avian";
	void chirp() {
		System.out.println("chip chip chip");
	}
}

//birds

class parrot extends bird{
	String size="65 cm";
	String color="red, blue and yellow";
}

class owl extends bird{
	String size="65 cm";
	String color="white, tan, gray, and brown";
}

public class prelimExam {
	public static void main(String[] args) {
		
		System.out.println("german shepherd");
		germanShepherd gs=new germanShepherd();
		gs.play();
		gs.bark();
		System.out.println(gs.type);
		
		System.out.println();
		
		System.out.println("parrot");
		parrot p=new parrot();
		p.chirp();
		p.eat();
		System.out.println(p.color);
	
		System.out.println();
		
		System.out.println("persian");
		persian ps=new persian();
		ps.meow();
		ps.play();
		System.out.println(ps.type);
		
		
	}
}