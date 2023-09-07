package Basic_programs;

public class javaprog {
	static int price;
	javaprog(int price){
		this.price= price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javaprog p= new javaprog(100);
		javaprog p2= new javaprog(200);
		javaprog p3= new javaprog(300);
		System.out.println(p.price);

	}

}
