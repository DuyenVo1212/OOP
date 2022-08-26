package t3_GD_menu_noa_thay;

public class List {

	GiaoDich gd[] = new GiaoDich[100];
	private int CountGD, sum1 = 0, sum2 = 0, dem = 0, sumtien = 0;

	public List()
	{
	CountGD=0;
	for(int i=0; i<100; i++)
	gd[i] = new GiaoDich(); 
	}

	public void ThemGD(int temp) {
		if (CountGD > 100)
			System.out.println("Bo nho full, ko the them moi!");
		else {
			if (temp == 1) {
				gd[CountGD] = new GiaoDichVang();
				GiaoDichVang gdv = new GiaoDichVang();
				gdv.nhap();
				gdv.ThanhTien = gdv.ThanhTien();
				gd[CountGD] = gdv;
				sum1 += gdv.SoLuong;
			} else {
				gd[CountGD] = new GiaoDichTienTe();
				GiaoDichTienTe gdtt = new GiaoDichTienTe();
				gdtt.nhap();
				gdtt.ThanhTien = gdtt.TTien();
				gd[CountGD] = gdtt;
				sumtien += gdtt.ThanhTien;
				sum2 += gdtt.SoLuong;
				dem++;
			}
			CountGD++;
		}
	}

	public void HienThiDS() {
		for (int i = 0; i < CountGD; i++) {
			System.out.println("\n----So TT: " + (i + 1));
			System.out.println(gd[i].toString());
		}
	}

	// Tong so luong cua giao dich
	public void TongSL() {
		System.out.println("|-> Tong So Luong cua Giao Dich Vang: " + sum1 + " <-|");
		System.out.println("|-> Tong So Luong cua Giao Dich Tien Te:" + sum2 + " <-|");
	}

	public void TrungBinhGDTT() {
		System.out.println("|-> Trung Binh Thanh Tien Giao Dich Tien Te: " + (sumtien / dem) + " <-|");
	}

	// xuat danh sach giao dich 1 ty
	public void GiaoDich1ty() {
		int d = 0;
		for (int i = 0; i < CountGD; i++) {
			if (gd[i].DonGia > 1000) {
				System.out.println(gd[i].toString());
				d++;
			}
		}
		if (d == 0)
			System.out.println("Khong co Thong Tin!");
	}
}
