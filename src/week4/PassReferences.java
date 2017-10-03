package week4;

public class PassReferences {

	
		// TODO Auto-generated method stub
		static void f(PassReferences h){
			System.out.println("h inside f(): " + h);
		}
		public static void main(String[] args) {
			PassReferences p = new PassReferences();
			System.out.println("P inside main(): -- " + p);
			f(p);
	}

}
