package Xe;

public class ListXe {
	private ChuyenXe[] dsXe = new ChuyenXe[100];
	private int dem;
	public ListXe() {
		dem = 0;
		for(int i = 0; i < dem; i++) {
			dsXe[i] = new ChuyenXe();
		}
	}
	public boolean ThemXe(ChuyenXe xe) {
		if(xe != null) {
			if(dem > 100) {
				System.out.println("Khong them duoc");
				return false;
			} else {
				for(int i = 0; i < dem; i++) {
					if(dsXe[i].getMaSC().equalsIgnoreCase(xe.getMaSC())) {
						System.out.println("Khong them duoc");
						return false;
					}
				}
			}
			dsXe[dem] = xe;
			dem++;
			return true;
		}
		return false;
	}
	public void XuatNoiThanh() {
		for(int i = 0;  i < dem; i++) {
			if(dsXe[i] instanceof NoiThanh) {
				System.out.println(dsXe[i].toString());
			}
		}
	}
	public void XuatXe() {
		for(int i = 0; i < dem; i++) {
			System.out.println(dsXe[i].toString());
		}
	}
	public double TongTien() {
		double tt = 0;
		for(int i = 0; i < dem; i++) {
			tt = tt + dsXe[i].getDoanhthu();
		}
		return tt;
	}
	public void TongTienNoiThanh() {
		double ttnoi = 0;
		double ttngoai = 0;
		for(int i = 0; i < dem; i++) {
			if(dsXe[i] instanceof NoiThanh) {
				ttnoi = ttnoi + dsXe[i].getDoanhthu();
			} else {
				ttngoai = ttngoai + dsXe[i].getDoanhthu();
			}
			
		}
		System.out.println("Doanh thu xe noi thanh: "+ ttnoi);
		System.out.println("Doanh thu xe noi thanh: "+ ttngoai);
	}
}
