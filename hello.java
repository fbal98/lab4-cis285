public class Hello {
	public static void main(String[] args) {

		for(int i=1;i<=10;i++) {

			System.out.println("Hello World..."+i);
			if(i == 5){
				System.out.println("Reached 5 breaking now...");
				break;
			}
		}
	}
}
