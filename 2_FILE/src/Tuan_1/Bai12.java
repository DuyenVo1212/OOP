package Tuan_1;

public class Bai12 {
	//Viết chương trình in ra tổng của 10 số chẵn đầu tiên.
	static void in10SoChanDauTien() {
		int condition=0, i=2;
		while(condition<=10)
		{
			System.out.println(i+"\t");
			i+=2;
			condition++;
		}
	}
	public static void main(String[] args) {
		in10SoChanDauTien();
	}

}
