package cuoiki.b1;

import java.time.LocalDate;



public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNhanVien ls = new ListNhanVien();
	
		ls.ThemNhanVien(new BienChe("BC1", "Toan", LocalDate.of(2020, 7, 8), 3.3, true));
		ls.ThemNhanVien(new BienChe("BC2", "Van", LocalDate.of(2020, 7, 8), 3.3, false));
		ls.ThemNhanVien(new BienChe("BC3", "Nguyen", LocalDate.of(2020, 7, 8), 3.3, false));
		ls.ThemNhanVien(new HopDong("HD1", "Han", LocalDate.of(2020, 7, 8), 25));
		ls.ThemNhanVien(new HopDong("HD2", "Mai", LocalDate.of(2020, 7, 8), 10));
		ls.ThemNhanVien(new HopDong("HD3", "Duc", LocalDate.of(2020, 7, 8), 16));
		ls.XuatNhanVien();
	}

}
