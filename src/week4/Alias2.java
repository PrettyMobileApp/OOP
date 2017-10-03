package week4;

public class Alias2 {
	int i;
	Alias2(int ii){
		i=ii;
	}
	
	static void f(Alias2 reference){
		reference.i++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alias2 x = new Alias2(7);
		
		System.out.println("x: " + x.i);
		
		System.out.println("calling f(x) ");
		
		f(x);
		System.out.println("x: " + x.i);

		
	}

}