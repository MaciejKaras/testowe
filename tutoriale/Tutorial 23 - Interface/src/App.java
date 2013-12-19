
public class App {

	public static void main(String[] args) {
		
		Machine mach1 = new Machine();
		mach1.start();
		
		Machine mach2 = new Machine();
		mach2.start();
		mach2.start();
		mach2.start();
		
		Person person1 = new Person("lala");
		System.out.println(mach1.id);
		System.out.println(mach2.id);

	}

}
