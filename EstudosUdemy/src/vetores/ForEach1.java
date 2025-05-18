package vetores;

public class ForEach1 {

	public static void main(String[] args) {
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for(int x = 0; x < vect.length; x++) {
			System.out.println(vect[x]);
		}
		
		System.out.println("---------");
		for(String obj: vect) {
			System.out.println(obj);
		}
		
	}

}
