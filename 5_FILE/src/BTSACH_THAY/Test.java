package BTSACH_THAY;


import java.util.Scanner;


public class Test  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc = new Scanner(System.in);
		ListSach dss = new ListSach();
		do
		{
			System.out.println("\n\t-----------------------------------");
			System.out.println("\t0. Exit");
			System.out.println("\t1. Them Sach giao khao");
			System.out.println("\t2. Them Sach tham khao");
			System.out.println("\t3. Hien thi thong tin DS Sach");
			System.out.println("\t4. Hien thi tong thanh tien cac loai sach");
			System.out.println("\t5. Hien thi trung binh cong don gia sach tham khao");
			System.out.println("\t6. Hien thi sach giao khoa cua nxb : ");
			System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			x = sc.nextInt();
			System.out.println("------>>");
			switch(x)
			{
				case 1:
						dss.addSach(x,sc);
						break;
				case 2:
						dss.addSach(x, sc);
						break;
				case 3:
						dss.xuattt();
						break;
				case 4:
					dss.xuatTongTT();
					break;
				case 5:
					dss.sapxeptheoma();
					break;
				case 6:
					System.out.println("Nhap Nha xuat ban :");
					String nxb = sc.next();
					dss.xuatTTSGK_NXB(nxb);
					break;
			}
		} while(x!=0);
			System.out.println("");
	}
		
}

	

