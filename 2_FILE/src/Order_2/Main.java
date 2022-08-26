package Order_2;

public class Main {

	public static void main(String[] args) {
		Order[] od = new Order[4];
		od[0].addLineItem(new Product("Nuoc tuong", "HD1", 8000), 10);
		od[1].addLineItem(new Product("Gao", "HD1", 18000), 5);
		od[2].addLineItem(new Product("Duong", "HD1", 10000), 1);
		od[3].addLineItem(new Product("Gao", "HD1", 18000), 1);
		System.out.println(od);
	}

}
