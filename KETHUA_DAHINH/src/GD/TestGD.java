package GD;

import java.time.LocalDate;

public class TestGD {

	public static void main(String[] args) {
		AListGD lgd = new AListGD();
		lgd.ThemGD(new GDVang("V1",LocalDate.of(2020, 7, 8),1200000000,5,"9999"));
		lgd.ThemGD(new GDVang("V2",LocalDate.of(2020, 9, 7),700000000,5+7,"80%"));
		lgd.ThemGD(new GDVang("V3",LocalDate.of(2020, 10, 6),500000000,3,"Trang"));
		lgd.ThemGD(new GDTien("T1",LocalDate.of(2020, 10, 6),500000000,3,3.5,"VN"));
		lgd.ThemGD(new GDTien("T2",LocalDate.of(2020, 5, 1),1500000000,5,20,"Euro"));
		lgd.ThemGD(new GDTien("T3",LocalDate.of(2020, 7, 3),2000000000,7,23,"USD"));
		lgd.XuatGD();
		lgd.TBThanhTien();
		lgd.SoLuongGD();
		System.out.println("Don gia lon hon 1 ti la: ");
		lgd.DonGia1Ti();
	}

}
