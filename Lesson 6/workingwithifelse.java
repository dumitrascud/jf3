public class workingwithifelse {

	public static void main(String[] args){
		int a = -15, b = 13;
		Syetm.out.println("Valoarea a=" +a);
		if (a>0){
			System.out.println("a > 0");
		} else if (a==0){
			System.out.println("a = 0");
		}
		else {
			System.out.println("a<0");
		}
		System.out.println("Tying again");

		System.out.println("Valoarea a=" + a++);
		if (a>0){
			System.out.println("a > 0");
		} else if (a==0){
			System.out.println("a = 0");
		}
		else {
			System.out.println("a<0");
		}
	}

}
