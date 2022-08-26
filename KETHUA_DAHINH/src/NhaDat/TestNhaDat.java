package NhaDat;

import java.time.LocalDate;

public class TestNhaDat {

	public static void main(String[] args) {
		AListNhaDat lnd = new AListNhaDat();
		lnd.ThemNhaDat(new GDDat("D1",LocalDate.of(2012, 5, 4),50000000,500,"A"));
		lnd.ThemNhaDat(new GDDat("D2",LocalDate.of(2012, 9, 9),100000000,800,"B"));
		lnd.ThemNhaDat(new GDDat("D3",LocalDate.of(2012, 9, 5),150000000,1000,"C"));
		lnd.ThemNhaDat(new GDNha("N1", LocalDate.of(2012, 9, 1),40000000,2000,"Thuong","Nga 3"));
		lnd.ThemNhaDat(new GDNha("N2", LocalDate.of(2012, 5, 1),50000000,1000,"cao cap","Nga 4"));
		lnd.ThemNhaDat(new GDNha("N3", LocalDate.of(2012, 9, 2),140000000,5000,"Thuong","Nga 6"));
		lnd.XuatNhaDat();
		lnd.TinhTongTungLoai();
		lnd.TBThanhTien();
		lnd.GDThang9();
	}

}
